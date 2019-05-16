package me.me.linkease;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.command.Command;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class linkEase extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(this, this);
        }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (label.equalsIgnoreCase("discord") || label.equalsIgnoreCase("dc")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString(("discord"))));
        }


        if (label.equalsIgnoreCase("ts")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("ts")));
        }
        if (label.equalsIgnoreCase("store")) {

            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("store")));
        }
        return true;

    }

}