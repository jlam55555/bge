package bge.core.server

import bge.core.game.{Action, Event, Game}

/**
 * Top-level game server management.
 */
trait Server {
  val game: Game
  val connection: ServerConnection
}

/**
 * Encapsulates low-level connection details with the client.
 *
 * TODO: extend some closeable trait
 */
trait ServerConnection {
  def addr: String

  def emitEvent(evt: Event[Action]): Unit

  //  working here: need a method that will fetch/list the next messages
  //  should work on another thread and listen on a queue for the regular networked
  //  one, and for offline mode can be single-threaded and yield
}
