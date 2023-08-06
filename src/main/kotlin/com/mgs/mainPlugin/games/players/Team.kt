package com.mgs.mainPlugin.games.players

data class Team(
    val players: MutableList<GamePlayer>,
    var party: Party? = null
)
