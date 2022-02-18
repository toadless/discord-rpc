package net.toadless.discordrpc;

import com.sun.jna.Library;
import com.sun.jna.Native;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface DLL extends Library
{
    DLL INSTANCE = Native.load("discord-rpc", DLL.class);

    void Discord_Initialize(@NotNull String applicationId, @Nullable DiscordEventHandlers handlers, int autoRegister, @Nullable String optionalSteamId);
    void Discord_Register(String applicationId, String command);
    void Discord_RegisterSteamGame(String applicationId, String command);
    void Discord_UpdateHandlers(DiscordEventHandlers handlers);
    void Discord_Shutdown();
    void Discord_RunCallbacks();
    void Discord_UpdatePresence(DiscordRichPresence presence);
    void Discord_ClearPresence();
    void Discord_Respond(String userId, int reply);
}
