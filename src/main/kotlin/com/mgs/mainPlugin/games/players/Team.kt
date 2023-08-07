package com.mgs.mainPlugin.games.players

data class Team(
    val players: MutableList<GamePlayer>  = ArrayList(),
    var party: Party? = null
)
