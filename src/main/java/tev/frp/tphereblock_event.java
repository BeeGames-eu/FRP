package tev.frp;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class tphereblock_event implements Listener {
    @EventHandler
    public void tponme(PlayerCommandPreprocessEvent e){
        String args[] = e.getMessage().split(" ");
        if(args.length == 3){
            if(args[2].equals(e.getPlayer().getName())){
                e.setCancelled(true);
                e.getPlayer().sendMessage(ChatColor.RED + "Nemůžete teleportovat hráče na sebe!");
            }
        }
    }
}
