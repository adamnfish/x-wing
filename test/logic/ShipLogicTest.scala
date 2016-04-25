package logic

import data.Ships
import org.scalatest.{FreeSpec, Matchers}


class ShipLogicTest extends FreeSpec with Matchers {
  import ShipLogic._

  "shipcodesFromQueryString" - {
    "includes ghost attackshuttle if ghost is selected" in {
      shipcodesFromQueryString(s"${Ships.ghost.code}=1") should contain(Ships.ghostAttackShuttle.code)
    }

    "doesn't double up on the attack shuttle" in {
      val shipCodes = shipcodesFromQueryString(s"${Ships.ghost.code}=1&${Ships.ghostAttackShuttle.code}=1")
      shipCodes.count(_ == Ships.ghostAttackShuttle.code) shouldEqual 1
    }
  }
}
