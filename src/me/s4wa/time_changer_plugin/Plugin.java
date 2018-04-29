package me.s4wa.time_changer_plugin;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin implements Listener {
	@Override
	public void onEnable() {
		getCommand("playertime").setExecutor(new Cmd());
	}
}
