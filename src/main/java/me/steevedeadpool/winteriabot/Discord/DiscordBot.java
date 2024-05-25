package me.steevedeadpool.winteriabot.Discord;

import me.steevedeadpool.winteriabot.WinteriaBot;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.bukkit.configuration.ConfigurationSection;

public class DiscordBot {

    private final JDA jda;

    public JDA getJda() {
        return jda;
    }


    public DiscordBot(WinteriaBot plugin) {
        ConfigurationSection section = plugin.getConfig().getConfigurationSection("discord");

        JDABuilder builder = JDABuilder.createDefault(section.getString("token")).addEventListeners(new DiscordListener()).enableIntents(GatewayIntent.GUILD_MEMBERS, GatewayIntent.DIRECT_MESSAGES, GatewayIntent.MESSAGE_CONTENT).setActivity(Activity.watching(section.getString("rpc")));
        this.jda = builder.build();
    }


}
