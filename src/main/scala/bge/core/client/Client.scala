package bge.core.client

import bge.core.game.{Action, Event}

trait Client {
  def emitEvent(evt: Event[Action]): Unit
}
