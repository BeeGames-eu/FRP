package tev.frp;

import org.bukkit.plugin.java.JavaPlugin;
import tev.frp.aliases.*;
import tev.frp.extrakits.onDeathEvent;

public final class FRP extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("repair").setExecutor(new repaircmd());
        getCommand("gma").setExecutor(new gma());
        getCommand("gmc").setExecutor(new gmc());
        getCommand("gms").setExecutor(new gms());
        getCommand("gmsp").setExecutor(new gmsp());
        getCommand("spawn").setExecutor(new spawn());
        getCommand("fly").setExecutor(new Fly());
        getServer().getPluginManager().registerEvents(new onDeathEvent(), this);
        getServer().getPluginManager().registerEvents(new onJoinLeaveEvent(), this);
        getServer().getPluginManager().registerEvents(new tphereblock_event(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
