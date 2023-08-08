package com.mgs.mainPlugin.games.players

import com.mgs.mainPlugin.games.PlayerLists

data class Team(
    val players: MutableList<GamePlayer>  = ArrayList(),
    var party: Party? = null
) {
    init {
        PlayerLists.teamList.add(this)
    }

    fun remove() {
        party?.teams?.remove(this)
        PlayerLists.teamList.remove(this)
    }
}
