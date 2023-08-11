package com.mgs.mainPlugin.events

import com.mgs.mainPlugin.games.MiniGame
import org.bukkit.event.Event
import org.bukkit.event.HandlerList

class GameInitEvent(val minigame: MiniGame) : Event() {
    override fun getHandlers(): HandlerList {
        return HANDLERS
    }

    companion object {
        private val HANDLERS : HandlerList = HandlerList()

        @Suppress("unused")
        @JvmStatic
        fun getHandlerList() : HandlerList {
            return HANDLERS
        }
    }
}