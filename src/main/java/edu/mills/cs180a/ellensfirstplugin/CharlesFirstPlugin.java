package edu.mills.cs180a.ellensfirstplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class CharlesFirstPlugin extends JavaPlugin {
  @Override
  public void onEnable() {
    getLogger().info("charlesFirstPlugin.onEnable has been invoked!");
  }

  @Override
  public void onDisable() {
    getLogger().info("charlesFirstPlugin.onDisable has been invoked!");
  }
}
