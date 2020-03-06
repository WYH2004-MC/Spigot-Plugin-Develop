package com.wyh2004.myplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class heal implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player){
            if (commandSender.hasPermission("myplugin.commands.heal")){
                Player player = (Player) commandSender;
                if (player.getHealth() < 20){
                    player.sendMessage(ChatColor.GREEN + "你已被治疗");
                    player.setHealth(20);
                }else {
                    player.sendMessage(ChatColor.YELLOW + "你不需要治疗");
                }
            }else {
                commandSender.sendMessage("你没有使用该指令的权限(myplugin.commands.heal)");
                return false;
            }
        }else {
            commandSender.sendMessage(ChatColor.RED + "该指令只能由玩家执行!");
            return false;
        }
        return false;
    }
}
