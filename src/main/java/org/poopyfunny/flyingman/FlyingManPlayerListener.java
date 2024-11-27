/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.poopyfunny.flyingman;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.util.Vector;
// import org.bukkit.event.player.PlayerJoinEvent;
// import org.bukkit.util.Vector;

public class FlyingManPlayerListener extends PlayerListener {
    @Override
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.hasItem()) {
            float factor = 0;
            switch (event.getMaterial()) {
                case Material.SUGAR:
                    factor = 15;
                    break;
                case Material.GLOWSTONE_DUST:
                    factor = 50;
                default:
                    break;
            }
            if (factor > 0) {
                Location loc = player.getEyeLocation();
                Vector impulse = loc.getDirection();
                player.setVelocity(impulse.multiply(factor));
            }
        }
    }

    @Override
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage(ChatColor.AQUA + "Tip: snorting yeyo guarantees ascension (sugar, glowstone dust)");
    }
}