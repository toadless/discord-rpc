package net.toadless.discordrpc.callbacks;

import com.sun.jna.Callback;

public interface ErroredCallback extends Callback
{
    void accept(int errorCode, String message);
}
