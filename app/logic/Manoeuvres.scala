package logic

import models._

object Manoeuvres {
  def grid(manoeuvres: Set[Manoeuvre]): ManoeuvreGrid = {
    val rows = manoeuvres
      .groupBy(_.speed)
      .toList
      .sortBy(_._1 * -1)
      .map { case (speed, manoeuvresAtThisSpeed) =>
        speed -> ManoeuvreGridRow(
          manoeuvresAtThisSpeed.find(isLeftBank).map(_.colour),
          manoeuvresAtThisSpeed.find(isRightBank).map(_.colour),
          manoeuvresAtThisSpeed.find(isLeftTurn).map(_.colour),
          manoeuvresAtThisSpeed.find(isRightTurn).map(_.colour),
          manoeuvresAtThisSpeed.find(isStraight).map(_.colour),
          manoeuvresAtThisSpeed.find(isStop).map(_.colour),
          manoeuvresAtThisSpeed.find(isKTurn).map(_.colour),
          manoeuvresAtThisSpeed.find(isLeftSloop).map(_.colour),
          manoeuvresAtThisSpeed.find(isRightSloop).map(_.colour),
          manoeuvresAtThisSpeed.find(isLeftTallonRoll).map(_.colour),
          manoeuvresAtThisSpeed.find(isRightTallonRoll).map(_.colour)
        )
      }
    ManoeuvreGrid(
      rows,
      manoeuvres.exists(isLeftBank),
      manoeuvres.exists(isRightBank),
      manoeuvres.exists(isLeftTurn),
      manoeuvres.exists(isRightTurn),
      manoeuvres.exists(isStraight) || manoeuvres.exists(isStop),
      manoeuvres.exists(isKTurn),
      manoeuvres.exists(isLeftSloop),
      manoeuvres.exists(isRightSloop),
      manoeuvres.exists(isLeftTallonRoll),
      manoeuvres.exists(isRightTallonRoll)
    )
  }

  def isLeftBank(manoeuvre: Manoeuvre): Boolean = manoeuvre match {
    case bank: Bank => bank.direction.isLeft
    case _ => false
  }
  def isRightBank(manoeuvre: Manoeuvre): Boolean = manoeuvre match {
    case bank: Bank => bank.direction.isRight
    case _ => false
  }
  def isLeftTurn(manoeuvre: Manoeuvre): Boolean = manoeuvre match {
    case bank: Turn => bank.direction.isLeft
    case _ => false
  }
  def isRightTurn(manoeuvre: Manoeuvre): Boolean = manoeuvre match {
    case bank: Turn => bank.direction.isRight
    case _ => false
  }
  def isStraight(manoeuvre: Manoeuvre): Boolean = manoeuvre match {
    case straight: Straight => true
    case _ => false
  }
  def isStop(manoeuvre: Manoeuvre): Boolean = manoeuvre match {
    case stop: Stop => true
    case _ => false
  }
  def isKTurn(manoeuvre: Manoeuvre): Boolean = manoeuvre match {
    case kTurn: KTurn => true
    case _ => false
  }
  def isLeftSloop(manoeuvre: Manoeuvre): Boolean = manoeuvre match {
    case sLoop: SLoop => sLoop.direction.isLeft
    case _ => false
  }
  def isRightSloop(manoeuvre: Manoeuvre): Boolean = manoeuvre match {
    case sLoop: SLoop => sLoop.direction.isRight
    case _ => false
  }
  def isLeftTallonRoll(manoeuvre: Manoeuvre): Boolean = manoeuvre match {
    case tallonRoll: TallonRoll => tallonRoll.direction.isLeft
    case _ => false
  }
  def isRightTallonRoll(manoeuvre: Manoeuvre): Boolean = manoeuvre match {
    case tallonRoll: TallonRoll => tallonRoll.direction.isLeft
    case _ => false
  }

  def colourCode(colour: Colour): String = {
    colour match {
      case Red => "red"
      case White => "white"
      case Green => "light-green"
    }
  }
}
