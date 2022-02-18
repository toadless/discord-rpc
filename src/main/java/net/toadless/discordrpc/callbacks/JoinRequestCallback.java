package net.toadless.discordrpc.callbacks;

import com.sun.jna.Callback;
import net.toadless.discordrpc.DiscordUser;

public interface JoinRequestCallback extends Callback
{
    void accept(DiscordUser request);
}
