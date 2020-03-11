package com.wyh2004.myplugin.commands;

import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ping implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player){
            String PingMessage = "当前Ping值: %player_ping%" + "ms";
            Player player = (Player) commandSender;
            PingMessage = PlaceholderAPI.setPlaceholders(player, PingMessage);
            commandSender.sendMessage(PingMessage);
        }else{
            System.out.println("[Error]该指令只能由玩家执行");
        }
        return false;
    }
}
