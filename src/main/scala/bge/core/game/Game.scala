package bge.core.game

import bge.core.client.Client
import bge.core.server.ServerConnection

trait Game {
  type A <: Action

  def name: String

  def clientOnEvent(client: Client, evt: Event[A]): Unit

  def serverOnEvent(server: ServerConnection, evt: Event[A]): Unit
}
