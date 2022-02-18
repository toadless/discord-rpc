package net.toadless.discordrpc.callbacks;

import com.sun.jna.Callback;
import net.toadless.discordrpc.DiscordUser;

public interface ReadyCallback extends Callback
{
    void accept(DiscordUser user);
}