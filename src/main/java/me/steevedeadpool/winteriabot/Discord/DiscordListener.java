package me.steevedeadpool.winteriabot.Discord;

import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class DiscordListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        Message message = event.getMessage();
        String content = message.getContentRaw();

        if (content.equals("!ping")) {
            message.getChannel().sendMessage("pong").queue();
        }
    }
}
