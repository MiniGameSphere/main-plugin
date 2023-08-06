package com.mgs.mainPlugin.games.events.listeners

import com.mgs.mainPlugin.games.events.GameEndEvent

fun execute(event: GameEndEvent) {
    println(event.gameName)
}