package com.wyh2004.myplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class hello implements CommandExecutor {
    Plugin plugin = com.wyh2004.myplugin.MyPlugin.getPlugin(com.wyh2004.myplugin.MyPlugin.class);
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (plugin.getConfig().getBoolean("kaiguan")){
            commandSender.sendMessage(plugin.getConfig().getString("Message"));
            commandSender.sendMessage(plugin.getConfig().getStringList("text").get(2));
        }else {
            commandSender.sendMessage("该功能处于关闭状态，请前往配置文件启动该功能");
        }

        return false;
    }
}
