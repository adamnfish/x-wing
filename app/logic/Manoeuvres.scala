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
          manoeuvresAtThisSpeed.find(isSloop).map(_.colour),
          manoeuvresAtThisSpeed.find(isTallonRoll).map(_.colour)
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
      manoeuvres.exists(isSloop),
      manoeuvres.exists(isTallonRoll)
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
  def isSloop(manoeuvre: Manoeuvre): Boolean = manoeuvre match {
    case sLoop: SLoop => true
    case _ => false
  }
  def isTallonRoll(manoeuvre: Manoeuvre): Boolean = manoeuvre match {
    case tallonRoll: TallonRoll => true
    case _ => false
  }

  def colourCode(colour: Colour): String = {
    colour match {
      case Red => "red"
      case White => "grey"
      case Green => "green"
    }
  }
}
