package com.mgs.mainPlugin.events.listeners

import com.mgs.mainPlugin.events.GameInitEvent
import com.mgs.mainPlugin.games.MiniGames

fun execute(event: GameInitEvent) {
    MiniGames.minigames.add(event.minigame)
}