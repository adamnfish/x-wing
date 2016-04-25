package models

case class Ship(faction: Faction, name: String, code: String, wave: Int, manoeuvres: Set[Manoeuvre])

sealed trait Faction
object Empire extends Faction
object Rebellion extends Faction
object Scum extends Faction

sealed trait Colour
object Red extends Colour
object White extends Colour
object Green extends Colour

sealed trait Manoeuvre {
  val speed: Int
  val colour: Colour
}
case class Bank(speed: Int, direction: Either[Unit, Unit], colour: Colour) extends Manoeuvre
case class Turn(speed: Int, direction: Either[Unit, Unit], colour: Colour) extends Manoeuvre
case class Straight(speed: Int, colour: Colour) extends Manoeuvre
case class KTurn(speed: Int, colour: Colour) extends Manoeuvre
case class SLoop(speed: Int, direction: Either[Unit, Unit], colour: Colour) extends Manoeuvre
case class TallonRoll(speed: Int, direction: Either[Unit, Unit], colour: Colour) extends Manoeuvre
case class Stop(colour: Colour) extends Manoeuvre {
  override val speed = 0
}
object Manoeuvre {
  /**
    * DSL of sorts for manoeuvres
    */
  val left = Left(())
  val right = Right(())
  implicit class IntWithManoeuvres(val speed: Int) extends AnyVal {
    def banks(colour: Colour = White): Set[Manoeuvre] = Set(Bank(speed, left, colour), Bank(speed, right, colour))
    def bank(direction: Either[Unit, Unit], colour: Colour = White): Set[Manoeuvre] = Set(Bank(speed, direction, colour))
    def turns(colour: Colour = White): Set[Manoeuvre] = Set(Turn(speed, left, colour), Turn(speed, right, colour))
    def turn(direction: Either[Unit, Unit], colour: Colour = White): Set[Manoeuvre] = Set(Turn(speed, direction, colour))
    def straight(colour: Colour = White): Set[Manoeuvre] = Set(Straight(speed, colour))
    def kTurn(colour: Colour): Set[Manoeuvre] = Set(KTurn(speed, colour))
    def sloops(colour: Colour): Set[Manoeuvre] = Set(SLoop(speed, left, colour), SLoop(speed, right, colour))
    def sloop(direction: Either[Unit, Unit], colour: Colour): Set[Manoeuvre] = Set(SLoop(speed, direction, colour))
    def tallons(colour: Colour): Set[Manoeuvre] = Set(TallonRoll(speed, left, colour), TallonRoll(speed, right, colour))
    def tallon(direction: Either[Unit, Unit], colour: Colour): Set[Manoeuvre] = Set(TallonRoll(speed, direction, colour))
    def stop(colour: Colour): Set[Manoeuvre] = Set(Stop(colour))
  }
}

case class ManoeuvreGrid(
  rows: List[(Int, ManoeuvreGridRow)],
  hasLeftBank: Boolean,
  hasRightBank: Boolean,
  hasLeftTurn: Boolean,
  hasRightTurn: Boolean,
  hasStraight: Boolean,
  hasKTurn: Boolean,
  hasLeftSLoop: Boolean,
  hasRightSLoop: Boolean,
  hasLeftTallonRoll: Boolean,
  hasRightTallonRoll: Boolean
)
case class ManoeuvreGridRow(
  leftBank: Option[Colour],
  rightBank: Option[Colour],
  leftTurn: Option[Colour],
  rightTurn: Option[Colour],
  straight: Option[Colour],
  stop: Option[Colour],
  kTurn: Option[Colour],
  leftSLoop: Option[Colour],
  rightSLoop: Option[Colour],
  leftTallonRoll: Option[Colour],
  rightTallonRoll: Option[Colour]
)
