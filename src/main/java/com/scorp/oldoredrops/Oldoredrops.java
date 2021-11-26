package com.scorp.oldoredrops;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class Oldoredrops extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void BlockBreak(BlockBreakEvent e){
        if (e.getPlayer().getGameMode() == GameMode.CREATIVE)
            return;
        if (e.getBlock().getType() == Material.IRON_ORE){
            e.setDropItems(false);
            e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.IRON_ORE));
        } else if (e.getBlock().getType() == Material.GOLD_ORE){
            e.setDropItems(false);
            e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.GOLD_ORE));
        } else if (e.getBlock().getType() == Material.COPPER_ORE){
            e.setDropItems(false);
            e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.COPPER_ORE));
        }
    }
}
