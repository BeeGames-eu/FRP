package tev.frp.aliases;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class v implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player p = (Player) sender;
            if(p.hasPermission("frp.vanish")){
                p.performCommand("staff");
            }else{
                p.sendMessage(ChatColor.RED +"Nemáte dostatečná práva!");
            }
        }
        return false;
    }
}
