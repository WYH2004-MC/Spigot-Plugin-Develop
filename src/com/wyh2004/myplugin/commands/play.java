package com.wyh2004.myplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class play implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (strings.length == 1){
            String Message = strings[0];
            commandSender.sendMessage(Message);
        }else {
            commandSender.sendMessage(ChatColor.RED + "你的指令语法不正确");
        }
        return false;
    }
}
