package com.mgs.mainPlugin.games.players

import com.mgs.mainPlugin.games.MiniGame
import com.mgs.mainPlugin.games.PlayerLists
import org.bukkit.entity.Player

data class GamePlayer(
    val player: Player,
    var team: Team = Team(),
    var miniGame: MiniGame? = null
) {
    val party: Party
        get() {
            return team.party
        }

    fun remove() {
        team.removePlayer(this)
        PlayerLists.playerMap.remove(player)
    }

    init {
        PlayerLists.playerMap[player] = this
        team.addPlayer(this)
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