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
            String ping_msg = "当前延迟: %player_ping%ms";
            ping_msg = PlaceholderAPI.setPlaceholders(player, ping_msg);
            player.sendMessage(ping_msg);
        }else{
            commandSender.sendMessage(ChatColor.RED + "该指令只能由玩家运行!你一个控制台检测个毛线延迟！");
        }
        return false;
    }
}
