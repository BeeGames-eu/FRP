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
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Map;

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
            case "Assassin":
                PotionEffect regen = new PotionEffect(PotionEffectType.REGENERATION, 70, 4);
                killer.addPotionEffect(regen);
                break;
            case "Tank":
                PotionEffect sila = new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 250, 0);
                PotionEffect degenerace = new PotionEffect(PotionEffectType.ABSORPTION, 250, 4);
                PotionEffect slow = new PotionEffect(PotionEffectType.SLOW, 250, 1);
                PotionEffect resistence = new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 250, 0);
                killer.addPotionEffect(sila);
                killer.addPotionEffect(degenerace);
                killer.addPotionEffect(slow);
                killer.addPotionEffect(resistence);
                break;
        }
    }
}
