package net.propromp.pcf.example

import net.propromp.pcf.api.AnnotationManager
import net.propromp.pcf.api.CommandManager
import org.bukkit.plugin.java.JavaPlugin

class PcfExample : JavaPlugin() {
	lateinit var commandManager:CommandManager
	lateinit var annotationManager:AnnotationManager
	override fun onEnable() {
		commandManager=CommandManager(this)
		annotationManager= AnnotationManager(commandManager)
		annotationManager.register(TestCommand::class.java)
	}
	override fun onDisable() {
		//停止処理
	}
}