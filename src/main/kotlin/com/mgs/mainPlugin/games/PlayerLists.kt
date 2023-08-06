package com.mgs.mainPlugin.games

import com.mgs.mainPlugin.games.players.GamePlayer
import com.mgs.mainPlugin.games.players.Party
import com.mgs.mainPlugin.games.players.Team
import org.bukkit.entity.Player

object PlayerLists {

    val playerMap = HashMap<Player, GamePlayer>()

    val teamList = ArrayList<Team>()

    val partyList = ArrayList<Party>()

}