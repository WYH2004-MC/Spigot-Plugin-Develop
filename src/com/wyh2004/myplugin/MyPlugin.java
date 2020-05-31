/*
Author information
-------------------
Code By WYH2004
Web Site:
https://www.wyh2004.top
 */

package com.wyh2004.myplugin;

import com.wyh2004.myplugin.commands.*;
import com.wyh2004.myplugin.event.ChatEvent;
import com.wyh2004.myplugin.event.PlayerJoin;
import com.wyh2004.myplugin.gui.ClickGUI;
import com.wyh2004.myplugin.gui.itemopengui;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public class MyPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {
            getConfig().options().copyDefaults();
            saveDefaultConfig();

            getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
            getServer().getPluginManager().registerEvents(new ChatEvent(), this);
            getServer().getPluginManager().registerEvents(new ClickGUI(), this);
            getServer().getPluginManager().registerEvents(new itemopengui(), this);

            getCommand("bilibili").setExecutor(new bilibili());
            getCommand("play").setExecutor(new play());
            getCommand("hi").setExecutor(new hi());
            getCommand("heal").setExecutor(new heal());
            getCommand("hello").setExecutor(new hello());
            getCommand("ping").setExecutor(new ping());
            getCommand("item").setExecutor(new item());

            int time = getConfig().getInt("Message-time");
            BukkitTask message = new com.wyh2004.myplugin.tasks.Message().runTaskTimer(this, 0,time * 20);

            System.out.println("[MyPlugin]插件已加载");
        } else {
            Bukkit.shutdown();
            throw new RuntimeException("无法找到PlaceholderAPI， 插件无法正常运行！");
        }
    }

    @Override
    public void onDisable() {
        System.out.println("[MyPlugin]插件已卸载");
    }
}
