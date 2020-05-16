package com.wyh2004.myplugin.gui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class GUI {
    public static void gui1(Player p){
        Inventory gui = Bukkit.createInventory(null, 27, ChatColor.RED + "不要白嫖");

        ItemStack item = new ItemStack(Material.BED, 1);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName(ChatColor.YELLOW + "领取一个床!");
        ArrayList<String> itemlore = new ArrayList<>();
        itemlore.add(ChatColor.RED + "wadas");
        itemMeta.setLore(itemlore);
        item.setItemMeta(itemMeta);

        gui.setItem(10, item);
        p.openInventory(gui);
    }
}
