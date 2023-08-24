package com.mgs.mainPlugin.utils

import com.mgs.mainPlugin.events.GameEndEvent
import com.mgs.mainPlugin.events.GameEndEventBase
import org.bukkit.Bukkit

fun <T : GameEndEventBase> gameEnd(generalEndEvent: GameEndEvent, gameEndEvent: T) {
    val pluginManager = Bukkit.getPluginManager()
    pluginManager.callEvent(generalEndEvent)
    pluginManager.callEvent(gameEndEvent)
}