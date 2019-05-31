package command;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import static command.FlexiUtils.getGuildAudioPlayer;

public class Clear extends Command {
    public Clear() {
        identifiers = new String[]{"clear"};
    }

    @Override
    public boolean execute(MessageReceivedEvent event, String[] input) {
        getGuildAudioPlayer(event.getGuild()).scheduler.clear();
        event.getTextChannel().sendMessage("☁ Queue cleared!").queue();
        return true;
    }
}
