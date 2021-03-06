package me.s4wa.time_changer_plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Cmd implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player player = (Player) sender;

		if (args.length == 0) return false;
		else if (args.length == 1) {
			if (args[0].equalsIgnoreCase("day")) player.setPlayerTime(1000, false);
			else if (args[0].equalsIgnoreCase("noon")) player.setPlayerTime(6000, false);
			else if (args[0].equalsIgnoreCase("night")) player.setPlayerTime(18000, false);
			else if (args[0].equalsIgnoreCase("reset")) player.resetPlayerTime();
			else if (args[0] != null && Long.valueOf(args[0]) != null)
				player.setPlayerTime(Long.valueOf(args[0]), false);
			else return false;
		}
		return true;
	}
}
