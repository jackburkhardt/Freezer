package com.jackburkhardt.plugins.freezer;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class FreezeEvent implements Listener {
    private boolean frozen;

    public FreezeEvent() {
        frozen = false;
    }
    public boolean getFrozenStatus() {
        return this.frozen;
    }

    public void setFrozenStatus(boolean b) {
        frozen = b;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void playerMoveHandler(PlayerMoveEvent event) {
        if (frozen && !event.getPlayer().hasPermission("freeze.exempt")) {
            event.setTo(event.getFrom());
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void playerInteractHandler(PlayerInteractEvent event) {
        if (frozen && !event.getPlayer().hasPermission("freeze.exempt")) {
            event.setCancelled(true);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void playerInteractEntityHandler(PlayerInteractEntityEvent event) {
        if (frozen && !event.getPlayer().hasPermission("freeze.exempt")) {
            event.setCancelled(true);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void blockPlaceHandler(BlockPlaceEvent event) {
        if (frozen && !event.getPlayer().hasPermission("freeze.exempt")) {
            event.setCancelled(true);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void blockBreakHandler(BlockBreakEvent event) {
        if (frozen && !event.getPlayer().hasPermission("freeze.exempt")) {
            event.setCancelled(true);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void inventoryInteractHandler(InventoryClickEvent event) {
        if (frozen && !event.getWhoClicked().hasPermission("freeze.exempt")) {
            event.setCancelled(true);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void entityDamageHandler(EntityDamageByEntityEvent event) {
        if (frozen && !event.getEntity().hasPermission("freeze.exempt")) {
            event.setCancelled(true);
        }
    }

}
