package net.toadless.discordrpc.callbacks;

import com.sun.jna.Callback;

public interface DisconnectedCallback extends Callback
{
    void accept(int errorCode, String message);
}
