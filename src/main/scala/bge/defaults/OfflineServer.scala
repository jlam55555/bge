package bge.defaults

import bge.core.game.{Action, Event, Game}
import bge.core.server.ServerConnection

class OfflineServer extends ServerConnection {
  override def addr: String = "offline"

  override def emitEvent(evt: Event[Action]): Unit = ()
}
