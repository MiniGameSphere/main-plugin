package com.mgs.mainPlugin.games.players

import com.mgs.mainPlugin.games.MiniGame
import com.mgs.mainPlugin.games.PlayerLists
import org.bukkit.entity.Player

data class GamePlayer(
    val player: Player,
    var team: Team? = null,
    var party: Party? = null,
    var miniGame: MiniGame? = null
) {
    fun add() {
        PlayerLists.playerMap[player] = this
    }

    fun remove() {
        PlayerLists.playerMap.remove(player)
    }

    companion object {
        val Player.gamePlayer : GamePlayer
            get() {
            val gamePlayer = PlayerLists.playerMap[this] ?: GamePlayer(player = this)
            PlayerLists.playerMap[this] = gamePlayer
            return gamePlayer
        }
    }
}