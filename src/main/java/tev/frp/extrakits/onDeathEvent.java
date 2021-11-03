package tev.frp.extrakits;

import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class onDeathEvent implements Listener {
    @EventHandler
    public void onDeathEvent(PlayerDeathEvent e){
        Player killer = e.getEntity().getKiller();
        String placeholder = "%kitbattle_selected_kit%";
        placeholder = PlaceholderAPI.setPlaceholders(killer, placeholder);
        switch(placeholder){
            case "Palioxis":
                ItemStack pearl = new ItemStack(Material.ENDER_PEARL);
                killer.getInventory().addItem(pearl);
                break;
            case "Switcher":
                ItemStack snowball = new ItemStack(Material.SNOW_BALL);
                ItemMeta meta = snowball.getItemMeta();
                meta.setDisplayName(ChatColor.RED + "Switch!");
                snowball.setItemMeta(meta);
                killer.getInventory().addItem(snowball);
                break;
        }
    }
}
