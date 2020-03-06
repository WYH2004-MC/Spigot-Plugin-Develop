package com.wyh2004.myplugin;

import com.wyh2004.myplugin.commands.*;
import com.wyh2004.myplugin.event.ChatEvent;
import com.wyh2004.myplugin.event.PlayerJoin;
import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {
    @Override
    public void onEnable() {

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new ChatEvent(), this);
        getCommand("bilibili").setExecutor(new bilibili());
        getCommand("play").setExecutor(new play());
        getCommand("hi").setExecutor(new hi());
        getCommand("heal").setExecutor(new heal());
        getCommand("hello").setExecutor(new hello());
        System.out.println("[MyPlugin]插件已加载");
    }

    @Override
    public void onDisable() {
        System.out.println("[MyPlugin]插件已卸载");
    }
}
