package com.wyh2004.myplugin.event;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

public class PlayerJoin implements Listener {
    Plugin plugin = com.wyh2004.myplugin.MyPlugin.getPlugin(com.wyh2004.myplugin.MyPlugin.class);
    @EventHandler
    public void PlayerJoin(PlayerJoinEvent event){
        String player = event.getPlayer().getName();
        event.setJoinMessage(ChatColor.translateAlternateColorCodes('&' ,player +  plugin.getConfig().getString("JoinMessage")));
    }
}
