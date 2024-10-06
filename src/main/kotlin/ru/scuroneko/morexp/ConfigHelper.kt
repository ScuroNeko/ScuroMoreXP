package ru.scuroneko.morexp

import me.shedaniel.autoconfig.AutoConfig
import net.fabricmc.loader.api.FabricLoader


object ConfigHelper {
    @JvmStatic fun getConfig(): Config {
        return if(isConfigLoaded()) AutoConfig.getConfigHolder(Config::class.java).config
        else Config()
    }

    private fun isConfigLoaded(): Boolean {
        val mods = FabricLoader.getInstance().allMods
        return mods.filter { mod -> mod.metadata.id == "cloth_config" }.size == 1
    }
}