package tev.frp;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class repair_function {
    public static void run(Player p){
        ItemStack[] inv = p.getInventory().getContents();
        ItemStack[] invarmor = p.getInventory().getArmorContents();
        for (ItemStack i: inv) {
            if(i != null)
            if(i.getDurability() >= 2)
            i.setDurability((short) 0);
        }
        for (ItemStack o: invarmor) {
            if(o != null)
            if(o.getDurability() >= 2)
                o.setDurability((short) 0);
        }
        p.getInventory().setContents(inv);
        p.getInventory().setArmorContents(invarmor);
    }
}
