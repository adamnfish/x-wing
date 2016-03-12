package models

case class Ship(faction: Faction, name: String, code: String, manoeuvres: Set[Manoeuvre])

sealed trait Faction
object Empire extends Faction
object Rebellion extends Faction
object Scum extends Faction

sealed trait Colour
object Red extends Colour
object White extends Colour
object Green extends Colour

sealed trait Manoeuvre
case class Bank(speed: Int, direction: Either[Unit, Unit], colour: Colour) extends Manoeuvre
case class Turn(speed: Int, direction: Either[Unit, Unit], colour: Colour) extends Manoeuvre
case class Straight(speed: Int, colour: Colour) extends Manoeuvre
case class KTurn(speed: Int, colour: Colour) extends Manoeuvre
case class SLoop(speed: Int, direction: Either[Unit, Unit], colour: Colour) extends Manoeuvre
case class TallonRoll(speed: Int, direction: Either[Unit, Unit], colour: Colour) extends Manoeuvre
case class Stop(colour: Colour) extends Manoeuvre
object Manoeuvre {
  /**
    * DSL of sorts for manoeuvres
    */
  val left = Left(())
  val right = Right(())
  implicit class IntWithManoeuvres(val speed: Int) extends AnyVal {
    def banks(colour: Colour = White): Set[Manoeuvre] = Set(Bank(speed, left, colour), Bank(speed, right, colour))
    def turns(colour: Colour = White): Set[Manoeuvre] = Set(Turn(speed, left, colour), Turn(speed, right, colour))
    def straight(colour: Colour = White): Set[Manoeuvre] = Set(Straight(speed, colour))
    def kTurn(colour: Colour): Set[Manoeuvre] = Set(KTurn(speed, colour))
    def sloops(colour: Colour): Set[Manoeuvre] = Set(SLoop(speed, left, colour), SLoop(speed, right, colour))
    def tallons(colour: Colour): Set[Manoeuvre] = Set(TallonRoll(speed, left, colour), TallonRoll(speed, right, colour))
    def stop(colour: Colour): Set[Manoeuvre] = Set(Stop(colour))
  }
}