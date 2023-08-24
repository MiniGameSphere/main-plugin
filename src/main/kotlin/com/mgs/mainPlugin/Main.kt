package com.mgs.mainPlugin

import com.mgs.mainPlugin.games.PlayerLists
import com.mgs.mainPlugin.events.listeners.EventListener
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {

    override fun onEnable() {
        val server = this.server
        val pluginManager = server.pluginManager

        EventListener.register(this)
    }

    override fun onDisable() {
        PlayerLists.playerMap.clear()
    }

}
