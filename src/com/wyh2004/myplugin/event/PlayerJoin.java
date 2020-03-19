package com.wyh2004.myplugin.event;

import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

public class PlayerJoin implements Listener {
    Plugin plugin = com.wyh2004.myplugin.MyPlugin.getPlugin(com.wyh2004.myplugin.MyPlugin.class);
    @EventHandler
    public void PlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        String Join_msg = plugin.getConfig().getString("JoinMessage");
        Join_msg = PlaceholderAPI.setPlaceholders(player, Join_msg);
        event.setJoinMessage(ChatColor.translateAlternateColorCodes('&' ,Join_msg));
    }
}
