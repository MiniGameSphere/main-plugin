package com.mgs.mainPlugin.games.players

import com.mgs.mainPlugin.games.PlayerLists

data class Party(
    private val teamList: MutableList<Team> = ArrayList(),
    var leadingTeam: Team? = null
) {
    val teams: List<Team>
        get() {
            return teamList.toList()
        }

    val partyLeader: GamePlayer?
        get() {
            return leadingTeam?.teamLeader
        }

    fun addTeam(team: Team) {
        leadingTeam ?: { leadingTeam = team }
        teamList.add(team)
    }
    fun removeTeam(team: Team) {
        teamList.remove(team)
        if (teamList.size == 0) {
            PlayerLists.partyList.remove(this)
        } else if (leadingTeam == team) {
            leadingTeam = teamList[0]
        }
    }

    val playerCount : Int
        get() {
            var total = 0
            teams.forEach { team -> total += team.players.size }
            return total
        }

    init {
        PlayerLists.partyList.add(this)
    }
}
