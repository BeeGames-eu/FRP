package tev.frp;

import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class repaircmd implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player p = (Player) sender;
            String coins_string = PlaceholderAPI.setPlaceholders(p, "%kitbattle_coins%");
            int coins = Integer.parseInt(coins_string);
            if(coins >= 50){
                repair_function.run(p);
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "kb coins remove " + p.getName() + " 50");
            }else{
                p.sendMessage(ChatColor.RED +"Nemáš dostatek peněz na opravu svého vybavení!");
            }
        }
        return false;
    }
}
