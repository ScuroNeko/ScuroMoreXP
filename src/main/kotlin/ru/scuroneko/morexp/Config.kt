package ru.scuroneko.morexp

import me.shedaniel.autoconfig.ConfigData
import me.shedaniel.autoconfig.annotation.Config

@Config(name = MoreXP.MOD_ID)
class Config : ConfigData {
    var ignoreEnderDragon = true
    val secondDragonXp = 12000

    val witherXp = 18000

    val wardenXp = 24000
}