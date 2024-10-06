package ru.scuroneko.morexp

import me.shedaniel.autoconfig.AutoConfig
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer
import net.fabricmc.api.ModInitializer
import net.fabricmc.loader.api.FabricLoader
import org.slf4j.LoggerFactory

object MoreXP : ModInitializer {
	@JvmStatic
    val LOGGER = LoggerFactory.getLogger("morexp")
//	@JvmStatic
	const val MOD_ID = "morexp"

	override fun onInitialize() {
		AutoConfig.register(Config::class.java, ::GsonConfigSerializer)
	}
}