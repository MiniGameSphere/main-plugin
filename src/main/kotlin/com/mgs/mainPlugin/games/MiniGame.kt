package com.mgs.mainPlugin.games

import com.mgs.mainPlugin.events.GameInitEvent
import org.bukkit.plugin.java.JavaPlugin

abstract class MiniGame : JavaPlugin() {
    abstract fun startGame()

    fun initGame() {
        this.server.pluginManager.callEvent(GameInitEvent(this))
    }
}