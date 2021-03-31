package com.jackburkhardt.plugins.freezer;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Freezer extends JavaPlugin {
    FreezeEvent freezer;

    public void onEnable() {
        freezer = new FreezeEvent();
        getServer().getPluginManager().registerEvents(freezer, this);
    }

    public void onDisable() {}

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("freeze")) {
            if (!freezer.getFrozenStatus()) {
                freezer.setFrozenStatus(true);
                getServer().broadcastMessage("" + ChatColor.RED + ChatColor.BOLD + "The game has been frozen by an admin. Please do not disconnect.");
            } else if (freezer.getFrozenStatus()) {
                freezer.setFrozenStatus(false);
                getServer().broadcastMessage("" + ChatColor.GREEN + ChatColor.BOLD + "The game has been unfrozen. Player control has been returned.");
            }
        }
        return true;
    }
}
