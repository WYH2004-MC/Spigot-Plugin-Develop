package com.wyh2004.myplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class skull implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player){
            Player p = (Player) commandSender;

            ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
            SkullMeta meta = (SkullMeta) skull.getItemMeta();
            meta.setDisplayName(ChatColor.GREEN +  "很丑的人");
            meta.setOwner("Hello_Han");
            skull.setItemMeta(meta);
            p.getInventory().addItem(skull);

        }else {
            commandSender.sendMessage("你不是玩家，无法使用这条指令!");
            return false;
        }
        return false;
    }
}
