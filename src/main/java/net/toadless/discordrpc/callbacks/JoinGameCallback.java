package net.toadless.discordrpc.callbacks;

import com.sun.jna.Callback;

public interface JoinGameCallback extends Callback
{
    void accept(String joinSecret);
}