package com.mgs.mainPlugin.games.events.listeners

import com.mgs.mainPlugin.games.players.GamePlayer
import org.bukkit.event.player.PlayerJoinEvent

fun execute(event: PlayerJoinEvent) {
    GamePlayer(player = event.player).add()
}