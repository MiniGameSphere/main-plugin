package com.mgs.mainPlugin.events

import org.bukkit.event.HandlerList

class GameEndEvent(override val gameName: String) : GameEndEventBase() {

    override fun getHandlers(): HandlerList {
        return HANDLERS
    }

    companion object {
        private val HANDLERS : HandlerList = HandlerList()

        @Suppress("unused", "unused")
        @JvmStatic
        fun getHandlerList() : HandlerList {
            return HANDLERS
        }
    }
}