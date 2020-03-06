package com.wyh2004.myplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class bilibili implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player){
            Player player = (Player) commandSender;
            String palyername = player.getName();
            player.sendMessage("欢迎" + palyername);
        }else{
            System.out.println("[Error]该指令只能由玩家执行");
        }

        return false;
    }
}
