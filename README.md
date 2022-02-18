<p align="center"> 
    <img src="https://i.imgur.com/75G4e1Q.png" width="400">
</p>

[discord-invite]: https://discord.gg/SzQdJPbwrQ

# Discord RPC
[![License](https://img.shields.io/badge/license-MIT-brightgreen.svg)](https://github.com/toadless/discord-rpc/blob/main/LICENSE)
[![Discord](https://discordapp.com/api/guilds/925386927794958348/widget.png)][discord-invite]

Discord RPC is a java wrapper for the [discord-rpc](https://github.com/discord/discord-rpc)

Check it out and download the latest builds [over on the releases page!](https://github.com/toadless/discord-rpc/releases)

## Setup
### Gradle
#### Repository
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}
```
#### Artifact
```groovy
dependencies {
    implementation 'com.github.toadless:discord-rpc:1.0.0'
}
```
### Maven
#### Repository
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```
#### Artifact
```xml
<dependency>
    <groupId>com.github.toadless</groupId>
    <artifactId>discord-rpc</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Basic Usage
```java
import net.toadless.discordrpc.*;

public class Main
{
    public static void main(String[] args)
    {
        DiscordEventHandlers handlers = new DiscordEventHandlers();
        handlers.ready = (user) -> System.out.println("Started!");

        DiscordRPC.discordInitialize("APPLICATION_ID", handlers, true);

        DiscordRichPresence presence = new DiscordRichPresence();
        presence.details = "RPC by toadless";
        presence.state = "Testing...";

        DiscordRPC.discordUpdatePresence(presence);

        new Thread(() ->
        {
            while (!Thread.currentThread().isInterrupted())
            {
                DiscordRPC.discordRunCallbacks();
                try
                {
                    Thread.sleep(2000);
                } catch (InterruptedException ignored)
                {}
            }
        }).start();
    }
}
```