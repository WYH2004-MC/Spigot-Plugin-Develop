package com.wyh2004.myplugin.event;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatEvent implements Listener {
    @EventHandler
    public void ChatEvent(AsyncPlayerChatEvent event){
        if (event.getMessage().contains("nmsl")){
            String Message = event.getMessage();
            event.setCancelled(true);
            Player player = event.getPlayer();
            String playerName = event.getPlayer().getName();
            player.sendMessage(ChatColor.RED + "请注意个人文明举止!");
            System.out.println(playerName + "尝试发送敏感词，已拦截，原内容:" + Message);
        }
    }
}
