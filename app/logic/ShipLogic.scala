package logic

import data.Ships
import models.Ship

object ShipLogic {
  def shipcodesFromQueryString(rawQueryString: String): List[String] = {
    val ships = for {
      entry <- rawQueryString.split("&").toList
      code <- entry.split("=").headOption
    } yield code

    if (ships.contains(Ships.ghost.code) && !ships.contains(Ships.ghostAttackShuttle.code)) {
      ships :+ Ships.ghostAttackShuttle.code
    } else {
      ships
    }
  }

  def lookupShips(allShips: List[Ship], codes: List[String]): List[Ship] = {
    allShips.filter(ship => codes.contains(ship.code))
  }
}
