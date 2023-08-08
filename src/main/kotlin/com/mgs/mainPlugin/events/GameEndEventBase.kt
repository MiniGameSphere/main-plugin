package com.mgs.mainPlugin.events

import org.bukkit.event.Event

abstract class GameEndEventBase : Event() {
    abstract val gameName : String
}