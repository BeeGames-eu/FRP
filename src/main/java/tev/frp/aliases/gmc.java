package tev.frp.aliases;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gmc implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player p = (Player) sender;
            if(p.hasPermission("*"))
                if(args.length == 1 ){
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "gamemode creative " + args[0]);
                }else{
                    p.performCommand("gamemode creative");
                }
        }else{
            if(args.length == 1 ){
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "gamemode creative " + args[0]);
            }else{
                sender.sendMessage(ChatColor.RED + "Musíte uvést hráče!");
            }
        }
        return false;
    }
}
