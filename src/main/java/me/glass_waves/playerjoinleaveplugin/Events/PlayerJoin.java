package me.glass_waves.playerjoinleaveplugin.Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {

    @EventHandler
    void onPlayerJoin(PlayerJoinEvent event)
    {
        Player player = event.getPlayer();

        event.setJoinMessage(ChatColor.AQUA + "Welcome to the server Master " + ChatColor.DARK_BLUE + player.getDisplayName());
    }
}
