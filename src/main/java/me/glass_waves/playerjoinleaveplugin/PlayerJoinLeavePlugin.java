package me.glass_waves.playerjoinleaveplugin;

import me.glass_waves.playerjoinleaveplugin.Events.PlayerJoin;
import me.glass_waves.playerjoinleaveplugin.Events.PlayerLeave;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerJoinLeavePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new PlayerLeave(), this);

    }


}
