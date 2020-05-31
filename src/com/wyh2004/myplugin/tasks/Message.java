package com.wyh2004.myplugin.tasks;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

public class Message extends BukkitRunnable {
    Plugin plugin = com.wyh2004.myplugin.MyPlugin.getPlugin(com.wyh2004.myplugin.MyPlugin.class);

    public static int list(int i){
        i = i + 1;
        return i;
    }

    private int i = 0;

    @Override
    public void run() {
        if (i < plugin.getConfig().getStringList("Message-list").size()){
            plugin.getServer().broadcastMessage(plugin.getConfig().getStringList("Message-list").get(i));
            i = list(i);
        } else {
            i = 0;
            Bukkit.getServer().broadcastMessage(plugin.getConfig().getStringList("Message-list").get(i));
            i = list(i);
        }
    }
}
