package logic

import models.Ship

object ShipLogic {
  def shipcodesFromQueryString(rawQueryString: String): List[String] = {
    for {
      entry <- rawQueryString.split("&").toList
      code <- entry.split("=").headOption
    } yield code
  }

  def lookupShips(allShips: List[Ship], codes: List[String]): List[Ship] = {
    allShips.filter(ship => codes.contains(ship.code))
  }
}
