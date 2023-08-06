package com.mgs.mainPlugin.games.events

import org.bukkit.event.Event
import org.bukkit.event.HandlerList

abstract class GameEndEvent(
) : Event() {
    abstract val gameName : String
}