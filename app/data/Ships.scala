package data

import models.Manoeuvre._
import models._

object Ships {
  val tieAdvanced = Ship(Empire, "TIE Advanced", "tie-advanced",
    1.banks(Green) ++
      2.turns() ++ 2.banks() ++ 2.straight(Green) ++
      3.turns() ++ 3.banks() ++ 3.straight(Green) ++
      4.straight() ++ 4.kTurn(Red) ++
      5.straight()
  )
  val tieInterceptor = Ship(Empire, "TIE Interceptor", "tie-interceptor",
    1.turns() ++
      2.turns(Green) ++ 2.banks(Green) ++ 2.straight(Green) ++
      3.turns() ++ 3.banks() ++ 3.straight(Green) ++ 3.kTurn(Red) ++
      4.straight(Green) ++
      5.straight() ++ 5.kTurn(Red)
  )
  val lambdaShuttle = Ship(Empire, "Lambda-class Shuttle", "lambda-shuttle",
    0.stop(Red) ++
      1.banks(Green) ++ 1.straight(Green) ++
      2.turns(Red) ++ 2.banks() ++ 2.straight(Green) ++
      3.banks(Red) ++ 3.straight()
  )

  val yWing = Ship(Rebellion, "Y-Wing", "y-wing",
    1.banks() ++ 1.straight(Green) ++
      2.turns() ++ 2.banks() ++ 2.straight(Green) ++
      3.turns(Red) ++ 3.banks() ++ 3.straight() ++
      4.straight(Red) ++ 4.kTurn(Red)
  )

  val allShips = List(tieAdvanced, tieInterceptor, lambdaShuttle, yWing)
}
