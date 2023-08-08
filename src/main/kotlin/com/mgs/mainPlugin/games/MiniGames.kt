package com.mgs.mainPlugin.games

object MiniGames {
    val minigames = ArrayList<MiniGame>()

    fun startRandomGame() {
        minigames.random().startGame()
    }
}