package com.mgs.mainPlugin.events

import org.bukkit.event.Event
import org.bukkit.event.HandlerList

class GameEndEvent(override val gameName: String) : GameEndEventBase() {

    override fun getHandlers(): HandlerList {
        return HANDLERS
    }

    companion object {
        private val HANDLERS : HandlerList = HandlerList()

        @JvmStatic
        fun getHandlerList() : HandlerList {
            return HANDLERS
        }
    }
}