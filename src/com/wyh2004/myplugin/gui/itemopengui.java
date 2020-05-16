package com.wyh2004.myplugin.gui;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class itemopengui implements Listener {
    @EventHandler
    public void gui1(PlayerInteractEvent e){
        Player p = e.getPlayer();
        try {
            if (p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "服务器菜单")){
                GUI.gui1(p);
            }
        } catch (Exception error){

        }
    }
}
