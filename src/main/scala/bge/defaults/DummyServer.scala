package bge.defaults

import bge.core.game.{Action, Event, Game}
import bge.core.server.ServerConnection

class DummyServer extends ServerConnection {
  override def addr: String = "n/a"

  override def emitEvent(evt: Event[Action]): Unit = ()
}
