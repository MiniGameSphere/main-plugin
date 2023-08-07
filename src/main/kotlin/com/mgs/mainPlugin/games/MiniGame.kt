package com.mgs.mainPlugin.games

import org.bukkit.plugin.java.JavaPlugin

abstract class MiniGame : JavaPlugin() {
    abstract fun startGame()
}