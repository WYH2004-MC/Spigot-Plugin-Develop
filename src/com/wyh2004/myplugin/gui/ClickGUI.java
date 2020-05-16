package com.wyh2004.myplugin.gui;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class ClickGUI implements Listener {
    @EventHandler
    public void Click(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "服务器菜单")){
                e.setCancelled(true);
                GUI.gui1(p);
            }
        }catch (Exception error){

        }
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.RED + "不要白嫖")){
            e.setCancelled(true);
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "领取一个床!")){
                ItemStack item = new ItemStack(Material.BED, 1);
                p.getInventory().addItem(item);
                p.sendMessage(ChatColor.AQUA + "你获得了一张床");
                p.closeInventory();
            }
        }
    }
}
