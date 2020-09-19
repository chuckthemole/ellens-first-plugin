package edu.mills.cs180a.ellensfirstplugin;

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
}
