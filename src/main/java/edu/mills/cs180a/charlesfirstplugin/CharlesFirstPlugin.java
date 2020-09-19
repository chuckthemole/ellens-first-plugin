package edu.mills.cs180a.charlesfirstplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class CharlesFirstPlugin extends JavaPlugin {
  @Override
  public void onEnable() {
    getLogger().info("CharlesFirstPlugin.onEnable has been invoked!");
  }

  @Override
  public void onDisable() {
    getLogger().info("CharlesFirstPlugin.onDisable has been invoked!");
  }

  @Override
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    if (cmd.getName().equalsIgnoreCase("walkfast")) {
      System.out.println("Command called for walkfast...");
      Player p = (Player) sender;
      p.setWalkSpeed(1);
      return true;
    }
    if (cmd.getName().equalsIgnoreCase("walkslow")) {
      System.out.println("Command called for walkfast...");
      Player p = (Player) sender;
      p.setWalkSpeed(.1f);
      return true;
    }
    if (cmd.getName().equalsIgnoreCase("walknormal")) {
      System.out.println("Command called for walkfast...");
      Player p = (Player) sender;
      p.setWalkSpeed(.2f);
      return true;
    }

    return false;
  }

  public static void spin(Player player) {}
}
