package tev.frp.aliases;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage(ChatColor.RED+"Tento příkaz je pouze pro hráče");
        } else {
            Player p = (Player) sender;
            if(p.hasPermission("jitsu.fly")){
                if (args.length == 0){
                    if(p.getAllowFlight()){
                        p.setFlying(false);
                        p.setAllowFlight(false);
                        p.sendMessage(ChatColor.RED+"Vypnul jste si fly");
                    } else {
                        p.setAllowFlight(true);
                        p.setFlying(true);
                        p.sendMessage(ChatColor.GREEN+"Zapnul jste si fly");
                    }
                } else if(p.hasPermission("jitsu.fly.others")){
                    Player t = Bukkit.getPlayerExact(args[0]);
                    if(t == null){
                        p.sendMessage(ChatColor.RED+"Hráč není online");
                    }else if(t.getAllowFlight()){
                        t.setFlying(false);
                        t.setAllowFlight(false);
                        t.sendMessage(ChatColor.RED+"Vypnul jste si fly");
                    } else {
                        t.setAllowFlight(true);
                        t.setFlying(true);
                        t.sendMessage(ChatColor.GREEN+"Zapnul jste si fly");
                    }
                } else {
                    p.sendMessage(ChatColor.RED+"Na to nemáš práva");
                }
            } else {
                p.sendMessage(ChatColor.RED+"Na to nemáš práva");
            }
        }
        return false;
    }
}
