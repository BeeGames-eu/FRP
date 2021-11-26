package tev.frp;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class onJoinLeaveEvent implements Listener {
    @EventHandler
    public void onJoinEvent(PlayerJoinEvent e){
        e.setJoinMessage("");
    }

    @EventHandler
    public void onLeaveEvent(PlayerQuitEvent e){
        e.setQuitMessage("");
    }
}
