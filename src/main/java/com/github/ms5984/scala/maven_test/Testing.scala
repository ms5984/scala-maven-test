package com.github.ms5984.scala.maven_test

import org.bukkit.command.{Command, CommandSender}
import org.bukkit.entity.Player
import org.bukkit.plugin.java.JavaPlugin

class Testing extends JavaPlugin {
  override def onEnable(): Unit =
    {
      println("Here we are again")
    }

  override def onDisable(): Unit = super.onDisable()

  override def onCommand(sender: CommandSender, command: Command, label: String, args: Array[String]): Boolean = {
    if (!sender.isInstanceOf[Player]) {
      return false
    }
    sender.sendMessage("You are a player! Very nice")
    true
  }
}
