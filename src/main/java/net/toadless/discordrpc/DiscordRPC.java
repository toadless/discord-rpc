package net.toadless.discordrpc;

public class DiscordRPC
{
    public static void discordInitialize(String applicationId, DiscordEventHandlers handlers, Boolean autoRegister)
    {
        DLL.INSTANCE.Discord_Initialize(applicationId, handlers, autoRegister ? 1 : 0, null);
    }

    public static void discordInitialize(String applicationId, DiscordEventHandlers handlers, Boolean autoRegister, String steamId)
    {
        DLL.INSTANCE.Discord_Initialize(applicationId, handlers, autoRegister ? 1 : 0, steamId);
    }

    public static void discordRegister(String applicationId, String command)
    {
        DLL.INSTANCE.Discord_Register(applicationId, command);
    }

    public static void discordRegisterSteam(String applicationId, String steamId)
    {
        DLL.INSTANCE.Discord_RegisterSteamGame(applicationId, steamId);
    }

    public static void discordUpdateEventHandlers(DiscordEventHandlers handlers)
    {
        DLL.INSTANCE.Discord_UpdateHandlers(handlers);
    }

    public static void discordShutdown()
    {
        DLL.INSTANCE.Discord_Shutdown();
    }

    public static void discordRunCallbacks()
    {
        DLL.INSTANCE.Discord_RunCallbacks();
    }

    public static void discordUpdatePresence(DiscordRichPresence presence)
    {
        DLL.INSTANCE.Discord_UpdatePresence(presence);
    }

    public static void discordClearPresence()
    {
        DLL.INSTANCE.Discord_ClearPresence();
    }

    public static void discordRespond(String userId, DiscordReply reply)
    {
        DLL.INSTANCE.Discord_Respond(userId, reply.reply);
    }
}