package com.mgs.mainPlugin.games.players

import com.mgs.mainPlugin.games.PlayerLists

data class Party(
    val teams: MutableList<Team> = ArrayList()
) {
    val playerCount : Int
        get() {
            var total = 0
            teams.forEach { team -> total += team.players.size }
            return total
        }

    fun remove() {
        PlayerLists.partyList.remove(this)
    }
    init {
        PlayerLists.partyList.add(this)
    }
}
