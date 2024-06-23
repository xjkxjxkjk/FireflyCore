// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedMessage;

public final class ChallengeBossPhaseSettleNotifyOuterClass {
  /**
   * <pre>
   *  EHFKHFOGLFJ
   * </pre>
   *
   * Protobuf type {@code ChallengeBossPhaseSettleNotify}
   */
  public static final class ChallengeBossPhaseSettleNotify extends ProtoMessage<ChallengeBossPhaseSettleNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 phase = 3;</code>
     */
    private int phase;

    /**
     * <code>optional uint32 challenge_score = 6;</code>
     */
    private int challengeScore;

    /**
     * <code>optional uint32 CPJOLGJDICK = 8;</code>
     */
    private int cPJOLGJDICK;

    /**
     * <code>optional uint32 stars = 9;</code>
     */
    private int stars;

    /**
     * <code>optional uint32 challenge_id = 10;</code>
     */
    private int challengeId;

    /**
     * <code>optional uint32 score_two = 14;</code>
     */
    private int scoreTwo;

    /**
     * <pre>
     *  NNJCJEODEPK
     * </pre>
     *
     * <code>optional bool is_win = 1;</code>
     */
    private boolean isWin;

    /**
     * <code>optional bool KJFDFGLCJPB = 2;</code>
     */
    private boolean kJFDFGLCJPB;

    /**
     * <code>optional bool GIPCBILIPIP = 15;</code>
     */
    private boolean gIPCBILIPIP;

    /**
     * <pre>
     *  EDAGGOCLHEP
     * </pre>
     *
     * <code>repeated .BattleTarget battle_target_list = 7;</code>
     */
    private final RepeatedMessage<BattleTargetOuterClass.BattleTarget> battleTargetList = RepeatedMessage.newEmptyInstance(BattleTargetOuterClass.BattleTarget.getFactory());

    private ChallengeBossPhaseSettleNotify() {
    }

    /**
     * <pre>
     *  EHFKHFOGLFJ
     * </pre>
     *
     * @return a new empty instance of {@code ChallengeBossPhaseSettleNotify}
     */
    public static ChallengeBossPhaseSettleNotify newInstance() {
      return new ChallengeBossPhaseSettleNotify();
    }

    /**
     * <code>optional uint32 phase = 3;</code>
     * @return whether the phase field is set
     */
    public boolean hasPhase() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 phase = 3;</code>
     * @return this
     */
    public ChallengeBossPhaseSettleNotify clearPhase() {
      bitField0_ &= ~0x00000001;
      phase = 0;
      return this;
    }

    /**
     * <code>optional uint32 phase = 3;</code>
     * @return the phase
     */
    public int getPhase() {
      return phase;
    }

    /**
     * <code>optional uint32 phase = 3;</code>
     * @param value the phase to set
     * @return this
     */
    public ChallengeBossPhaseSettleNotify setPhase(final int value) {
      bitField0_ |= 0x00000001;
      phase = value;
      return this;
    }

    /**
     * <code>optional uint32 challenge_score = 6;</code>
     * @return whether the challengeScore field is set
     */
    public boolean hasChallengeScore() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 challenge_score = 6;</code>
     * @return this
     */
    public ChallengeBossPhaseSettleNotify clearChallengeScore() {
      bitField0_ &= ~0x00000002;
      challengeScore = 0;
      return this;
    }

    /**
     * <code>optional uint32 challenge_score = 6;</code>
     * @return the challengeScore
     */
    public int getChallengeScore() {
      return challengeScore;
    }

    /**
     * <code>optional uint32 challenge_score = 6;</code>
     * @param value the challengeScore to set
     * @return this
     */
    public ChallengeBossPhaseSettleNotify setChallengeScore(final int value) {
      bitField0_ |= 0x00000002;
      challengeScore = value;
      return this;
    }

    /**
     * <code>optional uint32 CPJOLGJDICK = 8;</code>
     * @return whether the cPJOLGJDICK field is set
     */
    public boolean hasCPJOLGJDICK() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 CPJOLGJDICK = 8;</code>
     * @return this
     */
    public ChallengeBossPhaseSettleNotify clearCPJOLGJDICK() {
      bitField0_ &= ~0x00000004;
      cPJOLGJDICK = 0;
      return this;
    }

    /**
     * <code>optional uint32 CPJOLGJDICK = 8;</code>
     * @return the cPJOLGJDICK
     */
    public int getCPJOLGJDICK() {
      return cPJOLGJDICK;
    }

    /**
     * <code>optional uint32 CPJOLGJDICK = 8;</code>
     * @param value the cPJOLGJDICK to set
     * @return this
     */
    public ChallengeBossPhaseSettleNotify setCPJOLGJDICK(final int value) {
      bitField0_ |= 0x00000004;
      cPJOLGJDICK = value;
      return this;
    }

    /**
     * <code>optional uint32 stars = 9;</code>
     * @return whether the stars field is set
     */
    public boolean hasStars() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 stars = 9;</code>
     * @return this
     */
    public ChallengeBossPhaseSettleNotify clearStars() {
      bitField0_ &= ~0x00000008;
      stars = 0;
      return this;
    }

    /**
     * <code>optional uint32 stars = 9;</code>
     * @return the stars
     */
    public int getStars() {
      return stars;
    }

    /**
     * <code>optional uint32 stars = 9;</code>
     * @param value the stars to set
     * @return this
     */
    public ChallengeBossPhaseSettleNotify setStars(final int value) {
      bitField0_ |= 0x00000008;
      stars = value;
      return this;
    }

    /**
     * <code>optional uint32 challenge_id = 10;</code>
     * @return whether the challengeId field is set
     */
    public boolean hasChallengeId() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional uint32 challenge_id = 10;</code>
     * @return this
     */
    public ChallengeBossPhaseSettleNotify clearChallengeId() {
      bitField0_ &= ~0x00000010;
      challengeId = 0;
      return this;
    }

    /**
     * <code>optional uint32 challenge_id = 10;</code>
     * @return the challengeId
     */
    public int getChallengeId() {
      return challengeId;
    }

    /**
     * <code>optional uint32 challenge_id = 10;</code>
     * @param value the challengeId to set
     * @return this
     */
    public ChallengeBossPhaseSettleNotify setChallengeId(final int value) {
      bitField0_ |= 0x00000010;
      challengeId = value;
      return this;
    }

    /**
     * <code>optional uint32 score_two = 14;</code>
     * @return whether the scoreTwo field is set
     */
    public boolean hasScoreTwo() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional uint32 score_two = 14;</code>
     * @return this
     */
    public ChallengeBossPhaseSettleNotify clearScoreTwo() {
      bitField0_ &= ~0x00000020;
      scoreTwo = 0;
      return this;
    }

    /**
     * <code>optional uint32 score_two = 14;</code>
     * @return the scoreTwo
     */
    public int getScoreTwo() {
      return scoreTwo;
    }

    /**
     * <code>optional uint32 score_two = 14;</code>
     * @param value the scoreTwo to set
     * @return this
     */
    public ChallengeBossPhaseSettleNotify setScoreTwo(final int value) {
      bitField0_ |= 0x00000020;
      scoreTwo = value;
      return this;
    }

    /**
     * <pre>
     *  NNJCJEODEPK
     * </pre>
     *
     * <code>optional bool is_win = 1;</code>
     * @return whether the isWin field is set
     */
    public boolean hasIsWin() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <pre>
     *  NNJCJEODEPK
     * </pre>
     *
     * <code>optional bool is_win = 1;</code>
     * @return this
     */
    public ChallengeBossPhaseSettleNotify clearIsWin() {
      bitField0_ &= ~0x00000040;
      isWin = false;
      return this;
    }

    /**
     * <pre>
     *  NNJCJEODEPK
     * </pre>
     *
     * <code>optional bool is_win = 1;</code>
     * @return the isWin
     */
    public boolean getIsWin() {
      return isWin;
    }

    /**
     * <pre>
     *  NNJCJEODEPK
     * </pre>
     *
     * <code>optional bool is_win = 1;</code>
     * @param value the isWin to set
     * @return this
     */
    public ChallengeBossPhaseSettleNotify setIsWin(final boolean value) {
      bitField0_ |= 0x00000040;
      isWin = value;
      return this;
    }

    /**
     * <code>optional bool KJFDFGLCJPB = 2;</code>
     * @return whether the kJFDFGLCJPB field is set
     */
    public boolean hasKJFDFGLCJPB() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <code>optional bool KJFDFGLCJPB = 2;</code>
     * @return this
     */
    public ChallengeBossPhaseSettleNotify clearKJFDFGLCJPB() {
      bitField0_ &= ~0x00000080;
      kJFDFGLCJPB = false;
      return this;
    }

    /**
     * <code>optional bool KJFDFGLCJPB = 2;</code>
     * @return the kJFDFGLCJPB
     */
    public boolean getKJFDFGLCJPB() {
      return kJFDFGLCJPB;
    }

    /**
     * <code>optional bool KJFDFGLCJPB = 2;</code>
     * @param value the kJFDFGLCJPB to set
     * @return this
     */
    public ChallengeBossPhaseSettleNotify setKJFDFGLCJPB(final boolean value) {
      bitField0_ |= 0x00000080;
      kJFDFGLCJPB = value;
      return this;
    }

    /**
     * <code>optional bool GIPCBILIPIP = 15;</code>
     * @return whether the gIPCBILIPIP field is set
     */
    public boolean hasGIPCBILIPIP() {
      return (bitField0_ & 0x00000100) != 0;
    }

    /**
     * <code>optional bool GIPCBILIPIP = 15;</code>
     * @return this
     */
    public ChallengeBossPhaseSettleNotify clearGIPCBILIPIP() {
      bitField0_ &= ~0x00000100;
      gIPCBILIPIP = false;
      return this;
    }

    /**
     * <code>optional bool GIPCBILIPIP = 15;</code>
     * @return the gIPCBILIPIP
     */
    public boolean getGIPCBILIPIP() {
      return gIPCBILIPIP;
    }

    /**
     * <code>optional bool GIPCBILIPIP = 15;</code>
     * @param value the gIPCBILIPIP to set
     * @return this
     */
    public ChallengeBossPhaseSettleNotify setGIPCBILIPIP(final boolean value) {
      bitField0_ |= 0x00000100;
      gIPCBILIPIP = value;
      return this;
    }

    /**
     * <pre>
     *  EDAGGOCLHEP
     * </pre>
     *
     * <code>repeated .BattleTarget battle_target_list = 7;</code>
     * @return whether the battleTargetList field is set
     */
    public boolean hasBattleTargetList() {
      return (bitField0_ & 0x00000200) != 0;
    }

    /**
     * <pre>
     *  EDAGGOCLHEP
     * </pre>
     *
     * <code>repeated .BattleTarget battle_target_list = 7;</code>
     * @return this
     */
    public ChallengeBossPhaseSettleNotify clearBattleTargetList() {
      bitField0_ &= ~0x00000200;
      battleTargetList.clear();
      return this;
    }

    /**
     * <pre>
     *  EDAGGOCLHEP
     * </pre>
     *
     * <code>repeated .BattleTarget battle_target_list = 7;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableBattleTargetList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<BattleTargetOuterClass.BattleTarget> getBattleTargetList() {
      return battleTargetList;
    }

    /**
     * <pre>
     *  EDAGGOCLHEP
     * </pre>
     *
     * <code>repeated .BattleTarget battle_target_list = 7;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<BattleTargetOuterClass.BattleTarget> getMutableBattleTargetList() {
      bitField0_ |= 0x00000200;
      return battleTargetList;
    }

    /**
     * <pre>
     *  EDAGGOCLHEP
     * </pre>
     *
     * <code>repeated .BattleTarget battle_target_list = 7;</code>
     * @param value the battleTargetList to add
     * @return this
     */
    public ChallengeBossPhaseSettleNotify addBattleTargetList(
        final BattleTargetOuterClass.BattleTarget value) {
      bitField0_ |= 0x00000200;
      battleTargetList.add(value);
      return this;
    }

    /**
     * <pre>
     *  EDAGGOCLHEP
     * </pre>
     *
     * <code>repeated .BattleTarget battle_target_list = 7;</code>
     * @param values the battleTargetList to add
     * @return this
     */
    public ChallengeBossPhaseSettleNotify addAllBattleTargetList(
        final BattleTargetOuterClass.BattleTarget... values) {
      bitField0_ |= 0x00000200;
      battleTargetList.addAll(values);
      return this;
    }

    @Override
    public ChallengeBossPhaseSettleNotify copyFrom(final ChallengeBossPhaseSettleNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        phase = other.phase;
        challengeScore = other.challengeScore;
        cPJOLGJDICK = other.cPJOLGJDICK;
        stars = other.stars;
        challengeId = other.challengeId;
        scoreTwo = other.scoreTwo;
        isWin = other.isWin;
        kJFDFGLCJPB = other.kJFDFGLCJPB;
        gIPCBILIPIP = other.gIPCBILIPIP;
        battleTargetList.copyFrom(other.battleTargetList);
      }
      return this;
    }

    @Override
    public ChallengeBossPhaseSettleNotify mergeFrom(final ChallengeBossPhaseSettleNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasPhase()) {
        setPhase(other.phase);
      }
      if (other.hasChallengeScore()) {
        setChallengeScore(other.challengeScore);
      }
      if (other.hasCPJOLGJDICK()) {
        setCPJOLGJDICK(other.cPJOLGJDICK);
      }
      if (other.hasStars()) {
        setStars(other.stars);
      }
      if (other.hasChallengeId()) {
        setChallengeId(other.challengeId);
      }
      if (other.hasScoreTwo()) {
        setScoreTwo(other.scoreTwo);
      }
      if (other.hasIsWin()) {
        setIsWin(other.isWin);
      }
      if (other.hasKJFDFGLCJPB()) {
        setKJFDFGLCJPB(other.kJFDFGLCJPB);
      }
      if (other.hasGIPCBILIPIP()) {
        setGIPCBILIPIP(other.gIPCBILIPIP);
      }
      if (other.hasBattleTargetList()) {
        getMutableBattleTargetList().addAll(other.battleTargetList);
      }
      return this;
    }

    @Override
    public ChallengeBossPhaseSettleNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      phase = 0;
      challengeScore = 0;
      cPJOLGJDICK = 0;
      stars = 0;
      challengeId = 0;
      scoreTwo = 0;
      isWin = false;
      kJFDFGLCJPB = false;
      gIPCBILIPIP = false;
      battleTargetList.clear();
      return this;
    }

    @Override
    public ChallengeBossPhaseSettleNotify clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      battleTargetList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChallengeBossPhaseSettleNotify)) {
        return false;
      }
      ChallengeBossPhaseSettleNotify other = (ChallengeBossPhaseSettleNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasPhase() || phase == other.phase)
        && (!hasChallengeScore() || challengeScore == other.challengeScore)
        && (!hasCPJOLGJDICK() || cPJOLGJDICK == other.cPJOLGJDICK)
        && (!hasStars() || stars == other.stars)
        && (!hasChallengeId() || challengeId == other.challengeId)
        && (!hasScoreTwo() || scoreTwo == other.scoreTwo)
        && (!hasIsWin() || isWin == other.isWin)
        && (!hasKJFDFGLCJPB() || kJFDFGLCJPB == other.kJFDFGLCJPB)
        && (!hasGIPCBILIPIP() || gIPCBILIPIP == other.gIPCBILIPIP)
        && (!hasBattleTargetList() || battleTargetList.equals(other.battleTargetList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(phase);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(challengeScore);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(cPJOLGJDICK);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(stars);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(challengeId);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(scoreTwo);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 8);
        output.writeBoolNoTag(isWin);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRawByte((byte) 16);
        output.writeBoolNoTag(kJFDFGLCJPB);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        output.writeRawByte((byte) 120);
        output.writeBoolNoTag(gIPCBILIPIP);
      }
      if ((bitField0_ & 0x00000200) != 0) {
        for (int i = 0; i < battleTargetList.length(); i++) {
          output.writeRawByte((byte) 58);
          output.writeMessageNoTag(battleTargetList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(phase);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(challengeScore);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(cPJOLGJDICK);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(stars);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(challengeId);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(scoreTwo);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000100) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000200) != 0) {
        size += (1 * battleTargetList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(battleTargetList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChallengeBossPhaseSettleNotify mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // phase
            phase = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // challengeScore
            challengeScore = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // cPJOLGJDICK
            cPJOLGJDICK = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // stars
            stars = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // challengeId
            challengeId = input.readUInt32();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // scoreTwo
            scoreTwo = input.readUInt32();
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 8) {
              break;
            }
          }
          case 8: {
            // isWin
            isWin = input.readBool();
            bitField0_ |= 0x00000040;
            tag = input.readTag();
            if (tag != 16) {
              break;
            }
          }
          case 16: {
            // kJFDFGLCJPB
            kJFDFGLCJPB = input.readBool();
            bitField0_ |= 0x00000080;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // gIPCBILIPIP
            gIPCBILIPIP = input.readBool();
            bitField0_ |= 0x00000100;
            tag = input.readTag();
            if (tag != 58) {
              break;
            }
          }
          case 58: {
            // battleTargetList
            tag = input.readRepeatedMessage(battleTargetList, tag);
            bitField0_ |= 0x00000200;
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.phase, phase);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.challengeScore, challengeScore);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.cPJOLGJDICK, cPJOLGJDICK);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.stars, stars);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt32(FieldNames.challengeId, challengeId);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeUInt32(FieldNames.scoreTwo, scoreTwo);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeBool(FieldNames.isWin, isWin);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeBool(FieldNames.kJFDFGLCJPB, kJFDFGLCJPB);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        output.writeBool(FieldNames.gIPCBILIPIP, gIPCBILIPIP);
      }
      if ((bitField0_ & 0x00000200) != 0) {
        output.writeRepeatedMessage(FieldNames.battleTargetList, battleTargetList);
      }
      output.endObject();
    }

    @Override
    public ChallengeBossPhaseSettleNotify mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 106629499: {
            if (input.isAtField(FieldNames.phase)) {
              if (!input.trySkipNullValue()) {
                phase = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 591599599:
          case 1517684662: {
            if (input.isAtField(FieldNames.challengeScore)) {
              if (!input.trySkipNullValue()) {
                challengeScore = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1791462314: {
            if (input.isAtField(FieldNames.cPJOLGJDICK)) {
              if (!input.trySkipNullValue()) {
                cPJOLGJDICK = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 109757537: {
            if (input.isAtField(FieldNames.stars)) {
              if (!input.trySkipNullValue()) {
                stars = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -689112866:
          case 112359031: {
            if (input.isAtField(FieldNames.challengeId)) {
              if (!input.trySkipNullValue()) {
                challengeId = input.readUInt32();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -485512614:
          case 2129303327: {
            if (input.isAtField(FieldNames.scoreTwo)) {
              if (!input.trySkipNullValue()) {
                scoreTwo = input.readUInt32();
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 100482642:
          case -1179753657: {
            if (input.isAtField(FieldNames.isWin)) {
              if (!input.trySkipNullValue()) {
                isWin = input.readBool();
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1395404231: {
            if (input.isAtField(FieldNames.kJFDFGLCJPB)) {
              if (!input.trySkipNullValue()) {
                kJFDFGLCJPB = input.readBool();
                bitField0_ |= 0x00000080;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1645302018: {
            if (input.isAtField(FieldNames.gIPCBILIPIP)) {
              if (!input.trySkipNullValue()) {
                gIPCBILIPIP = input.readBool();
                bitField0_ |= 0x00000100;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1658064039:
          case 2141562245: {
            if (input.isAtField(FieldNames.battleTargetList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(battleTargetList);
                bitField0_ |= 0x00000200;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public ChallengeBossPhaseSettleNotify clone() {
      return new ChallengeBossPhaseSettleNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChallengeBossPhaseSettleNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChallengeBossPhaseSettleNotify(), data).checkInitialized();
    }

    public static ChallengeBossPhaseSettleNotify parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new ChallengeBossPhaseSettleNotify(), input).checkInitialized();
    }

    public static ChallengeBossPhaseSettleNotify parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new ChallengeBossPhaseSettleNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChallengeBossPhaseSettleNotify messages
     */
    public static MessageFactory<ChallengeBossPhaseSettleNotify> getFactory() {
      return ChallengeBossPhaseSettleNotifyFactory.INSTANCE;
    }

    private enum ChallengeBossPhaseSettleNotifyFactory implements MessageFactory<ChallengeBossPhaseSettleNotify> {
      INSTANCE;

      @Override
      public ChallengeBossPhaseSettleNotify create() {
        return ChallengeBossPhaseSettleNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName phase = FieldName.forField("phase");

      static final FieldName challengeScore = FieldName.forField("challengeScore", "challenge_score");

      static final FieldName cPJOLGJDICK = FieldName.forField("CPJOLGJDICK");

      static final FieldName stars = FieldName.forField("stars");

      static final FieldName challengeId = FieldName.forField("challengeId", "challenge_id");

      static final FieldName scoreTwo = FieldName.forField("scoreTwo", "score_two");

      static final FieldName isWin = FieldName.forField("isWin", "is_win");

      static final FieldName kJFDFGLCJPB = FieldName.forField("KJFDFGLCJPB");

      static final FieldName gIPCBILIPIP = FieldName.forField("GIPCBILIPIP");

      static final FieldName battleTargetList = FieldName.forField("battleTargetList", "battle_target_list");
    }
  }
}
