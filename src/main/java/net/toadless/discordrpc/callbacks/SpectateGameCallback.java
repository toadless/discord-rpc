package net.toadless.discordrpc.callbacks;

import com.sun.jna.Callback;

public interface SpectateGameCallback extends Callback
{
    void accept(String spectateSecret);
}
