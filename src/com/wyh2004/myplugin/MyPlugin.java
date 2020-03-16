//Author information
//-------------------
//Code By WYH2004
//Web Site:
//https://wyh2004.top
package com.wyh2004.myplugin;

import com.wyh2004.myplugin.commands.*;
import com.wyh2004.myplugin.event.ChatEvent;
import com.wyh2004.myplugin.event.PlayerJoin;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {
    @Override
    public void onEnable() {

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {
            getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
            getServer().getPluginManager().registerEvents(new ChatEvent(), this);
            getCommand("bilibili").setExecutor(new bilibili());
            getCommand("play").setExecutor(new play());
            getCommand("hi").setExecutor(new hi());
            getCommand("heal").setExecutor(new heal());
            getCommand("hello").setExecutor(new hello());
            getCommand("ping").setExecutor(new ping());
            System.out.println("[MyPlugin]插件已加载");
        } else {
            getServer().shutdown();
            throw new RuntimeException("无法找到PlaceholderAPI!! 插件无法正常运行!");
        }
    }

    @Override
    public void onDisable() {
        System.out.println("[MyPlugin]插件已卸载");
    }
}
