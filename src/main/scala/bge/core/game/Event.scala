package bge.core.game

trait Event[A <: Action] {
  val action: A
}
