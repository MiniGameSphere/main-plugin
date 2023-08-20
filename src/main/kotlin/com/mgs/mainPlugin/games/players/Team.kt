package com.mgs.mainPlugin.games.players

import com.mgs.mainPlugin.games.PlayerLists

data class Team(
    private val playerList: MutableList<GamePlayer> = ArrayList(),
    var party: Party = Party(),
    var teamLeader: GamePlayer? = null
) {

    val players: List<GamePlayer>
        get() {
            return playerList.toList()
        }

    fun addPlayer(gp: GamePlayer) {
        teamLeader ?: { teamLeader = gp }
        playerList.add(gp)
    }

    fun removePlayer(gp: GamePlayer) {
        playerList.remove(gp)
        if (playerList.size == 0) {
            party.removeTeam(this)
            PlayerLists.teamList.remove(this)
        } else if (teamLeader == gp) {
            teamLeader = playerList[0]
        }
    }

    init {
        PlayerLists.teamList.add(this)
        party.addTeam(this)
    }
}
