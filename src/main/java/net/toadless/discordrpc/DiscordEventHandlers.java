package net.toadless.discordrpc;

import com.sun.jna.Structure;
import net.toadless.discordrpc.callbacks.*;

import java.util.Arrays;
import java.util.List;

public class DiscordEventHandlers extends Structure
{
    public ReadyCallback ready;
    public DisconnectedCallback disconnected;
    public ErroredCallback errored;
    public JoinGameCallback joinGame;
    public SpectateGameCallback spectateGame;
    public JoinRequestCallback joinRequest;

    @Override
    public List<String> getFieldOrder() {
        return Arrays.asList(
                "ready",
                "disconnected",
                "errored",
                "joinGame",
                "spectateGame",
                "joinRequest"
        );
    }
}