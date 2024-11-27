/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.poopyfunny.flyingman;

import org.bukkit.event.Event.Priority;
import org.bukkit.event.Event.Type;
import org.bukkit.plugin.java.JavaPlugin;


// import org.bukkit.event.EventPriority;
// import org.bukkit.event.player.PlayerInteractEvent;
// import org.bukkit.plugin.java.JavaPlugin;

public class FlyingMan extends JavaPlugin{
   @Override
   public void onEnable() {
        System.out.println("FlyingMan Enabled.");
        getServer().getPluginManager().registerEvent(Type.PLAYER_INTERACT, new FlyingManPlayerListener(), Priority.Highest, this);
        getServer().getPluginManager().registerEvent(Type.PLAYER_JOIN, new FlyingManPlayerListener(), Priority.Highest, this);
   }

   @Override
   public void onDisable() {
        System.out.println("FlyingMan Off.");
   }
}