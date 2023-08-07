package com.mgs.mainPlugin.events.listeners

import com.mgs.mainPlugin.events.GameEndEvent
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent
import org.bukkit.plugin.java.JavaPlugin

object EventListener : Listener {

    fun register(plugin: JavaPlugin) {
        plugin.server.pluginManager.registerEvents(this, plugin)
    }

    @EventHandler
    fun playerJoin(event: PlayerJoinEvent) { execute(event) }

    @EventHandler
    fun playerLeave(event: PlayerQuitEvent) { execute(event) }

    @EventHandler
    fun gameEnd(event: GameEndEvent) { execute(event) }

}