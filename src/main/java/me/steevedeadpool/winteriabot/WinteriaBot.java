package me.steevedeadpool.winteriabot;

import me.steevedeadpool.winteriabot.Discord.DiscordBot;
import org.bukkit.plugin.java.JavaPlugin;

public final class WinteriaBot extends JavaPlugin {

    private static WinteriaBot instance;

    private static DiscordBot bot;


    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        bot = new DiscordBot(instance);
    }

    @Override
    public void onDisable() {
        // Логика отключения плагина
    }
}