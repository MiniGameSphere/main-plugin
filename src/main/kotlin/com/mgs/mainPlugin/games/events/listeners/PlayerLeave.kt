package com.mgs.mainPlugin.games.events.listeners

import com.mgs.mainPlugin.games.players.GamePlayer.Companion.gamePlayer
import org.bukkit.event.player.PlayerQuitEvent

fun execute(event: PlayerQuitEvent) {
    event.player.gamePlayer.remove()
}