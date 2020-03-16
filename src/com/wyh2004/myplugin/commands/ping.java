package com.wyh2004.myplugin.commands;

import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ping implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player){
            Player player = (Player) commandSender;
            String ping = "当前延迟: %player_ping%ms";
            ping = PlaceholderAPI.setPlaceholders(player, ping);
            player.sendMessage(ChatColor.YELLOW + ping);
        } else {
            commandSender.sendMessage(ChatColor.RED + "此指令只能由玩家执行！");
        }
        return false;
    }
}
