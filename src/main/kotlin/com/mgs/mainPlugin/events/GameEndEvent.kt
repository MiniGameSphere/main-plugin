package com.mgs.mainPlugin.events

import org.bukkit.event.Event

abstract class GameEndEvent : Event() {
    abstract val gameName : String
}