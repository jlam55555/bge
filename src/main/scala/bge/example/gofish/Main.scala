package bge.example.gofish

import bge.core.game.Game
import bge.core.server.ServerConnection
import bge.defaults.{DefaultServer, OfflineServer}
import bge.example.gofish.GoFishGame


object Main {
  @main
  def hello(): Unit = {
    given Game = GoFishGame

    println(s"Running server for game: ${implicitly[Game].name}")

    val s: ServerConnection = new OfflineServer()
    println(s"Server at: ${s.addr}")
  }
}
