package emu.lunarcore.game.challenge;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Transient;
import emu.lunarcore.GameConstants;
import emu.lunarcore.data.GameData;
import emu.lunarcore.data.excel.ChallengeExcel;
import emu.lunarcore.game.battle.Battle;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.game.scene.Scene;
import emu.lunarcore.game.scene.entity.EntityMonster;
import emu.lunarcore.proto.BattleEndReasonOuterClass.BattleEndReason;
import emu.lunarcore.proto.BattleEndStatusOuterClass.BattleEndStatus;
import emu.lunarcore.proto.BattleStatisticsOuterClass.BattleStatistics;
import emu.lunarcore.proto.BattleTargetOuterClass.BattleTarget;
import emu.lunarcore.proto.ChallengeInfoOuterClass.ChallengeInfo;
import emu.lunarcore.proto.ChallengeStatusOuterClass.ChallengeStatus;
import emu.lunarcore.proto.ExtraLineupTypeOuterClass.ExtraLineupType;
import emu.lunarcore.server.packet.send.*;
import emu.lunarcore.util.Position;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;

@Getter @Entity(useDiscriminator = false)
public class ChallengeInstance {
    private transient Player player;
    private transient ChallengeExcel excel;
    private Position startPos;
    private Position startRot;
    
    private int challengeId;
    private int currentStage;
    private int currentBossStage;
    private int currentExtraLineup;
    private int status;
    private boolean hasAvatarDied;
    
    @Setter private int savedMp;
    @Setter private int roundsLeft;
    @Setter private int stars;
    @Setter private int scoreStage1;
    @Setter private int scoreStage2;
    
    @Transient
    private List<BattleTarget> bossTarget1;
    @Transient 
    private List<BattleTarget> bossTarget2;
    @Transient
    private boolean isWin = false;
    
    private IntList storyBuffs;
    private IntList bossBuffs;
    
    @Deprecated // Morphia only
    public ChallengeInstance() {}

    public ChallengeInstance(Player player, ChallengeExcel excel) {
        this.player = player;
        this.excel = excel;
        this.challengeId = excel.getId();
        this.startPos = new Position();
        this.startRot = new Position();
        this.currentStage = 1;
        this.currentBossStage = 1;
        this.roundsLeft = getExcel().isStory() ? 5 : excel.getChallengeCountDown();
        this.setStatus(ChallengeStatus.CHALLENGE_DOING);
        this.setCurrentExtraLineup(ExtraLineupType.LINEUP_CHALLENGE);
    }
    
    private Scene getScene() {
        return this.getPlayer().getScene();
    }
    
    private int getChallengeId() {
        return this.getExcel().getId();
    }
    
    public boolean isStory() {
        return this.excel.isStory();
    }
    
    public boolean isBoss() {
        return this.excel.isBoss();
    }
    
    private void setStatus(ChallengeStatus status) {
        this.status = status.getNumber();
    }
    
    private void setCurrentExtraLineup(ExtraLineupType type) {
        this.currentExtraLineup = type.getNumber();
    }
    
    private int getRoundsElapsed() {
        return getExcel().getChallengeCountDown() - this.roundsLeft;
    }
    
    public int getTotalScore() {
        return this.scoreStage1 + this.scoreStage2;
    }

    public boolean isWin() {
        return status == ChallengeStatus.CHALLENGE_FINISH_VALUE;
    }
    
    public void addStoryBuff(int storyBuff) {
        // Add story buffs
        if (storyBuffs == null) {
            storyBuffs = new IntArrayList();
        }
        
        storyBuffs.add(storyBuff);
    }
    
    public void addBossBuff(int bossBuff) {
        if (bossBuffs == null) {
            bossBuffs = new IntArrayList();
        }
        
        bossBuffs.add(bossBuff);
    }
    
    public void onBattleStart(Battle battle) {
        // Set cycle limit
        battle.setRoundsLimit(player.getChallengeInstance().getRoundsLeft());
        
        // Add story buffs
        if (this.getStoryBuffs() != null) {
            battle.addBuff(this.getExcel().getMazeBuffID());
            
            int buffId = this.getStoryBuffs().getInt(this.getCurrentStage() - 1);
            if (buffId != 0) {
                battle.addBuff(buffId);
            }
        }
        
        // Add boss buffs
        if (this.getBossBuffs() != null) {
            battle.addBuff(this.getExcel().getMazeBuffID());
            
            int buffId = this.getBossBuffs().getInt(this.getCurrentStage() - 1);
            if (buffId != 0) {
                battle.addBuff(buffId);
            }

            // add battle target
            battle.addBattleTarget(1, 90004, 0);
            battle.addBattleTarget(1, 90005, 0);
        }
        
        // Add story battle targets
        if (this.getExcel().getStoryExcel() != null) {
            // Add base score counter
            battle.addBattleTarget(1, 10001, this.getTotalScore());
            // Add battle targets from story excel
            for (int id : getExcel().getStoryExcel().getBattleTargetID()) {
                battle.addBattleTarget(5, id, this.getTotalScore());
            }
        }
    }
    
    public void onBattleFinish(Battle battle, BattleEndStatus result, BattleStatistics stats) {
        // Add challenge score
        if (this.isStory()) {
            // Calculate score for current stage
            int stageScore = stats.getBattleScore() - this.getTotalScore();
            // Set score
            if (this.getCurrentStage() == 1) {
                this.scoreStage1 = stageScore;
            } else {
                this.scoreStage2 = stageScore;
            }
        }
        
        if (this.isBoss()) {
            var score = stats.getBattleScore();
            var scores = new LinkedList<BattleTarget>();
            var bt = stats.getBattleTargetInfo().get(0);
            if (bt != null) {
                score = 0;
                for (var battleTarget: bt.getValue().getMutableBattleTargetList()) {
                    score += battleTarget.getProgress();
                    scores.add(battleTarget);
                }
            }
            
            if (this.getCurrentStage() == 1) {
                this.scoreStage1 = score;
                this.bossTarget1 = scores;
            } else {
                this.scoreStage2 = score;
                this.bossTarget2 = scores;
            }
        }
        
        // Handle result
        switch (result) {
            case BATTLE_END_WIN:
                // Check if any avatar in the lineup has died
                battle.getLineup().forEachAvatar(avatar -> {
                    if (avatar.getCurrentHp(battle.getLineup()) <= 0) {
                        hasAvatarDied = true;
                    }
                });
                
                // Get monster count in stage
                long monsters = player.getScene().getEntities().values().stream().filter(e -> e instanceof EntityMonster).count();
                
                if (monsters == 0) {
                    this.advanceStage();
                }
                
                // Calculate rounds left
                if (!this.isStory()) {
                    this.roundsLeft = Math.min(Math.max(this.roundsLeft - stats.getRoundCnt(), 1), this.roundsLeft);
                }
                
                // Set saved technique points (This will be restored if the player resets the challenge)
                this.savedMp = player.getCurrentLineup().getMp();
                this.isWin = true;
                break;
            case BATTLE_END_QUIT:
                if (this.isBoss()) {
                    this.quitBossBattle();
                    return;
                }
                // Reset technique points and move back to start position
                var lineup = player.getCurrentLineup();
                lineup.setMp(this.savedMp);
                player.moveTo(this.getStartPos(), this.getStartRot());
                player.sendPacket(new PacketSyncLineupNotify(lineup));
                break;
            default:
                // Determine challenge result
                if ((this.isStory() || this.isBoss()) && stats.getEndReason() == BattleEndReason.BATTLE_END_REASON_TURN_LIMIT) {
                    // kill monsters first before advancing
                    for (EntityMonster npcMonster : battle.getNpcMonsters()) {
                        getScene().removeEntity(npcMonster);
                    }
                    
                    this.advanceStage();
                } else {
                    // Fail challenge
                    this.setStatus(ChallengeStatus.CHALLENGE_FAILED);
                    // Send challenge result data
                    player.sendPacket(new PacketChallengeSettleNotify(this));
                }
                break;
        }
    }
    
    public void enterNextPhase() {
        this.advanceStage();
    }
    
    
    public void restartChallenge() {
        var lineup = player.getCurrentLineup();
        
        // reset energy and sp
        lineup.forEachAvatar(avatar -> {
            avatar.setCurrentHp(lineup, 10000);
            avatar.setCurrentSp(lineup, avatar.getMaxSp() / 2);
        });
        lineup.setMp(GameConstants.MAX_MP);
        player.sendPacket(new PacketSyncLineupNotify(lineup));
        
        this.savedMp = lineup.getMp();
        
        // reset boss stage
        if (this.currentBossStage > 1) {
            this.currentBossStage--;
        }
        
        // re-load the group
        if (isWin) {
            player.getScene().loadGroup(this.currentStage == 1 ? excel.getMazeGroupID1() : excel.getMazeGroupID2());
        }
        player.sendPacket(new PacketRestartChallengePhaseScRsp(this.getScene().toProto()));
        player.getScene().syncLineup();
    }
    
    private void quitBossBattle() {
        player.sendPacket(new PacketChallengeBossPhaseSettleNotify(this));
    }
    
    private void advanceStage() {
        // Progress to the next stage
        if (this.currentStage >= excel.getStageNum()) {
            // Last stage
            this.setStatus(ChallengeStatus.CHALLENGE_FINISH);
            this.stars = this.calculateStars();
            // Save history
            player.getChallengeManager().addHistory(this.getChallengeId(), this.getStars(), this.getTotalScore());
            // Send challenge result data
            if (this.isBoss()) {
                player.sendPacket(new PacketChallengeBossPhaseSettleNotify(this));
            } else {
                player.sendPacket(new PacketChallengeSettleNotify(this));
            }
        } else {
            // show end battle (if boss challenge)
            if (this.isBoss() && this.currentBossStage == 1) {
                this.stars = this.calculateStars();
                this.currentBossStage++;
                player.sendPacket(new PacketChallengeBossPhaseSettleNotify(this));
                return;
            }
            
            // Increment and reset stage
            this.currentStage++;

            // enter next phase (if boss challenge)
            if (this.isBoss() && this.currentBossStage == 2) {
                // Change player lineup
                this.setCurrentExtraLineup(ExtraLineupType.LINEUP_CHALLENGE_2);
                player.getLineupManager().setCurrentExtraLineup(this.getCurrentExtraLineup(), false);
                player.sendPacket(new PacketChallengeLineupNotify(this.getCurrentExtraLineup()));
                
                // set mp
                this.savedMp = player.getCurrentLineup().getMp();
                
                player.enterScene(excel.getMapEntranceID2(), 0, false);
                // this.getScene().getEntitiesByGroup(EntityMonster.class, excel.getMazeGroupID1()).forEach(e -> getScene().removeEntity(e));
                this.getScene().loadGroup(excel.getMazeGroupID2());
                
                player.sendPacket(new PacketEnterChallengeNextPhaseScRsp(player.getScene().toProto()));
                this.getScene().syncLineup();
                
                return;
            }


            // Load scene group for stage 2
            this.getScene().loadGroup(excel.getMazeGroupID2());
            
            // Change player line up
            this.setCurrentExtraLineup(ExtraLineupType.LINEUP_CHALLENGE_2);
            player.getLineupManager().setCurrentExtraLineup(this.getCurrentExtraLineup(), true);
            player.sendPacket(new PacketChallengeLineupNotify(this.getCurrentExtraLineup()));
            
            // set mp
            this.savedMp = player.getCurrentLineup().getMp();
            
            // Move player
            player.moveTo(this.getStartPos(), this.getStartRot());
        }
    }

    public void onUpdate() {
        // End challenge if its done
        if (status != ChallengeStatus.CHALLENGE_DOING_VALUE) {
            getPlayer().setChallengeInstance(null);
        }
    }
    
    public int calculateStars() {
        int[] targets = getExcel().getChallengeTargetID();
        int stars = 0;
        
        for (int i = 0; i < targets.length; i++) {
            var target = GameData.getChallengeTargetExcelMap().get(targets[i]);
            if (target == null) continue;
            
            switch (target.getChallengeTargetType()) {
                case ROUNDS_LEFT:
                    if (this.getRoundsLeft() >= target.getChallengeTargetParam1()) {
                        stars += (1 << i);
                    }
                    break;
                case DEAD_AVATAR:
                    if (!this.hasAvatarDied) {
                        stars += (1 << i);
                    }
                    break;
                case TOTAL_SCORE:
                    if (this.getTotalScore() >= target.getChallengeTargetParam1()) {
                        stars += (1 << i);
                    }
                    break;
                default:
                    break;
            }
        }
        
        return Math.min(stars, 7);
    }

    public boolean validate(Player player) {
        if (this.player == null) {
            this.player = player;
            // Force extra lineup type to be set during login
            this.player.getLineupManager().setCurrentExtraLineup(this.getCurrentExtraLineup(), false);
        }
        
        this.excel = GameData.getChallengeExcelMap().get(this.challengeId);
        return this.excel != null;
    }
    
    public ChallengeInfo toProto() {
        var proto = ChallengeInfo.newInstance()
                .setChallengeId(this.getExcel().getId())
                .setStatusValue(this.getStatus())
                .setScore(this.getScoreStage1())
                .setScoreTwo(this.getScoreStage2())
                .setRoundCount(this.getRoundsElapsed())
                .setExtraLineupTypeValue(this.getCurrentExtraLineup());
                // .setUnk(1);
        
        if (this.getStoryBuffs() != null) {
            int buffId = this.getStoryBuffs().getInt(this.getCurrentStage() - 1);
            proto.getMutableStartInfo().getMutableCurStoryBuffs().addBuffList(buffId);
        }
        
        if (this.getBossBuffs() != null) {
            int buffId = this.getBossBuffs().getInt(this.getCurrentStage() - 1);
            proto
                .getMutableStartInfo()
                .getMutableCurBossBuffs()
                .addBuffList(buffId)
                .setPKGLMGHDPNJ(1);
        }
        
        return proto;
    }
}
