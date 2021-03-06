package net.toadless.discordrpc;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class DiscordRichPresence extends Structure
{
    public String state;
    public String details;
    public long startTimestamp;
    public long endTimestamp;
    public String largeImageKey;
    public String largeImageText;
    public String smallImageKey;
    public String smallImageText;
    public String partyId;
    public int partySize;
    public int partyMax;
    public String spectateSecret;
    public String joinSecret;
    public byte instance;

    @Override
    public List<String> getFieldOrder() {
        return Arrays.asList(
                "state",
                "details",
                "startTimestamp",
                "endTimestamp",
                "largeImageKey",
                "largeImageText",
                "smallImageKey",
                "smallImageText",
                "partyId",
                "partySize",
                "partyMax",
                "joinSecret",
                "spectateSecret",
                "instance"
        );
    }
}