package com.mgs.mainPlugin.games.players

data class Party(
    private val teams: MutableList<Team> = ArrayList()
) {
    val playerCount : Int
        get() {
            var total = 0
            teams.forEach { team -> total += team.players.size }
            return total
        }
}
