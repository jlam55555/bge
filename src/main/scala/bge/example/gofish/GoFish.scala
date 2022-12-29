package bge.example.gofish

import bge.core.client.Client
import bge.core.game.{Action, Event, Game}
import bge.core.server.ServerConnection

sealed trait GoFishAction extends Action {}

case class DrawCard(name: String, data: Int) extends GoFishAction

case class StealCard(name: String, data: Int) extends GoFishAction

object GoFishGame extends Game {
  type A = GoFishAction

  override def name: String = "Go Fish"

  override def clientOnEvent(client: Client, evt: Event[A]): Unit =
    println(evt.action match
      case DrawCard(_, _) => "test"
      case StealCard(name, data) => s"${name} -- ${data}"
    )

  override def serverOnEvent(server: ServerConnection, evt: Event[A]): Unit = ()
}