package emu.lunarcore.command.commands;

import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.game.account.BanManager;

@Command(label = "ban", permission = {"admin"}, requireTarget = true, desc = "/ban [player]. Bans a player from the server.")
public class BanCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        int targetUid = args.getTargetUid();

        if (BanManager.ban(targetUid) == true) {
            if (args.getOnlineTarget() != null) {
                // TODO: Use packet to make a window and kick player at once.
                args.getOnlineTarget().getSession().close();
            }

            args.sendMessage("Successfully Banned: " + targetUid);

        } else {
            args.sendMessage("Failed to Ban: " + targetUid);

        }
    }

}
