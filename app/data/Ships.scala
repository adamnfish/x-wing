package data

import models.Manoeuvre._
import models._

object Ships {
  val tieFighter = Ship(Empire, "TIE Fighter", "tie-fighter", 0,
    1.turns() ++
      2.turns() ++ 2.banks(Green) ++ 2.straight(Green) ++
      3.turns() ++ 3.banks() ++ 3.straight(Green) ++ 3.kTurn(Red) ++
      4.straight() ++ 4.kTurn(Red) ++
      5.straight()
  )
  val tieAdvanced = Ship(Empire, "TIE Advanced", "tie-advanced", 1,
    1.banks(Green) ++
      2.turns() ++ 2.banks() ++ 2.straight(Green) ++
      3.turns() ++ 3.banks() ++ 3.straight(Green) ++
      4.straight() ++ 4.kTurn(Red) ++
      5.straight()
  )
  val firespray = Ship(Empire, "Firespray", "firespray", 2,
    1.banks(Green) ++ 1.straight(Green) ++
      2.turns() ++ 2.banks() ++ 2.straight() ++
      3.turns() ++ 3.banks() ++ 3.straight() ++ 3.kTurn(Red) ++
      4.straight() ++ 4.kTurn(Red)
  )
  val tieInterceptor = Ship(Empire, "TIE Interceptor", "tie-interceptor", 2,
    1.turns() ++
      2.turns(Green) ++ 2.banks(Green) ++ 2.straight(Green) ++
      3.turns() ++ 3.banks() ++ 3.straight(Green) ++ 3.kTurn(Red) ++
      4.straight(Green) ++
      5.straight() ++ 5.kTurn(Red)
  )
  val tieBomber = Ship(Empire, "TIE Bomber", "tie-bomber", 3,
    1.banks() ++ 1.straight(Green) ++
      2.turns(Red) ++ 2.banks() ++ 2.straight(Green) ++
      3.turns() ++ 3.banks() ++ 3.straight(Green) ++
      4.straight() ++
      5.kTurn(Red)
  )
  val lambdaShuttle = Ship(Empire, "Lambda-class Shuttle", "lambda-shuttle", 3,
    0.stop(Red) ++
      1.banks(Green) ++ 1.straight(Green) ++
      2.turns(Red) ++ 2.banks() ++ 2.straight(Green) ++
      3.banks(Red) ++ 3.straight()
  )
  val tieDefender = Ship(Empire, "TIE Defender", "tie-defender", 4,
    1.turns(Red) ++ 1.banks() ++
      2.turns(Red) ++ 2.banks() ++ 2.straight(Green) ++
      3.turns() ++ 3.banks() ++ 3.straight(Green) ++
      4.straight(Green) ++ 4.kTurn(White) ++
      5.straight(Green)
  )
  val tiePhantom = Ship(Empire, "TIE Phantom", "tie-phantom", 4,
    1.turns() ++
      2.turns() ++ 2.banks(Green) ++ 2.straight(Green) ++
      3.turns() ++ 3.banks() ++ 3.straight(Green) ++ 3.kTurn(Red) ++
      4.straight() ++ 4.kTurn(Red)
  )
  val decimator = Ship(Empire, "Decimator", "decimator", 5,
    1.banks() ++ 1.straight() ++
      2.turns() ++ 2.banks(Green) ++ 2.straight(Green) ++
      3.turns() ++ 3.banks() ++ 3.straight() ++
      4.straight()
  )
  val tiePunisher = Ship(Empire, "TIE Punisher", "tie-punisher", 7,
    1.banks(Green) ++ 1.straight(Green) ++
      2.turns(Red) ++ 2.banks() ++ 2.straight(Green) ++
      3.turns() ++ 3.banks() ++ 3.straight() ++
      4.kTurn(Red)
  )
  val tieFO = Ship(Empire, "TIE/fo", "tie-fo", 0,
    1.turns() ++
      2.turns(Green) ++ 2.banks(Green) ++ 2.straight(Green) ++ 2.sloops(Red) ++
      3.turns() ++ 3.banks() ++ 3.straight(Green) ++
      4.straight() ++ 4.kTurn(Red) ++
      5.straight()
  )
  val tieInquisitor = Ship(Empire, "TIE Advanced Prototype", "tie-advanced-prototype", 8,
    1.turns(Green) ++ 1.banks(Green) ++ 1.straight(Green) ++
      2.turns() ++ 2.banks() ++ 2.straight(Green) ++
      3.turns() ++ 3.banks() ++ 3.straight(Green) ++
      4.straight() ++ 4.kTurn(Red) ++
      5.straight()
  )

  val xWing = Ship(Rebellion, "X-Wing", "x-wing", 0,
    1.banks(Green) ++ 1.straight(Green) ++
      2.turns() ++ 2.banks() ++ 2.straight(Green) ++
      3.turns() ++ 3.banks() ++ 3.straight() ++
      4.straight() ++ 4.kTurn(Red)
  )
  val yWing = Ship(Rebellion, "Y-Wing", "y-wing", 1,
    1.banks() ++ 1.straight(Green) ++
      2.turns() ++ 2.banks() ++ 2.straight(Green) ++
      3.turns(Red) ++ 3.banks() ++ 3.straight() ++
      4.straight(Red) ++ 4.kTurn(Red)
  )
  val yt1300 = Ship(Rebellion, "YT-1300", "yt-1300", 2,
    1.turns() ++ 1.banks() ++ 1.straight(Green) ++
      2.turns() ++ 2.banks() ++ 2.straight(Green) ++
      3.banks() ++ 3.straight() ++3.kTurn(Red) ++
      4.straight() ++ 4.kTurn(Red)
  )
  val aWing = Ship(Rebellion, "A-Wing", "a-wing", 2,
    1.turns() ++
      2.turns(Green) ++ 2.banks(Green) ++ 2.straight(Green) ++
      3.turns() ++ 3.banks() ++ 3.straight(Green) ++ 3.kTurn(Red) ++
      4.straight(Green) ++
      5.straight(Green) ++ 5.kTurn(Red)
  )
  val bWing = Ship(Rebellion, "B-Wing", "b-wing", 3,
    1.turns(Red) ++ 1.banks(Green) ++ 1.straight(Green) ++
      2.turns() ++ 2.banks() ++ 2.straight(Green) ++ 2.kTurn(Red) ++
      3.banks(Red) ++ 3.straight() ++
      4.straight(Red)
  )
  val hwk = Ship(Rebellion, "HWK-290", "hwk", 3,
    1.banks(Green) ++ 1.straight(Green) ++
      2.turns() ++ 2.banks() ++ 2.straight(Green) ++
      3.banks(Red) ++ 3.straight() ++
      4.straight(Red)
  )
  val z95 = Ship(Rebellion, "Z-95", "z-95", 4,
    1.banks() ++ 1.straight(Green) ++
      2.turns() ++ 2.banks(Green) ++ 2.straight(Green) ++
      3.turns() ++ 3.banks() ++ 3.straight() ++ 3.kTurn(Red) ++
      4.straight()
  )
  val eWing = Ship(Rebellion, "E-Wing", "e-wing", 4,
    1.banks() ++ 1.straight(Green) ++
    2.turns() ++ 2.banks(Green) ++ 2.straight(Green) ++
    3.turns() ++ 3.banks() ++ 3.straight(Green) ++ 3.kTurn(Red) ++
    4.straight() ++ 4.kTurn(Red) ++
    5.straight()
  )
  val yt2400 = Ship(Rebellion, "YT-2400", "yt-2400", 5,
    1.turns() ++ 1.banks(Green) ++ 1.straight(Green) ++
      2.turns() ++ 2.banks() ++ 2.straight(Green) ++
      3.turns() ++ 3.banks() ++ 3.straight() ++
      4.straight() ++ 4.kTurn(Red)
  )
  val kWing = Ship(Rebellion, "K-Wing", "k-wing", 7,
    1.banks(Green) ++ 1.straight(Green) ++
      2.turns() ++ 2.banks() ++ 2.straight(Green) ++
      3.banks() ++ 3.straight()
  )
  val t70 = Ship(Rebellion, "T-70 X-Wing", "t70", 0,
    1.banks(Green) ++ 1.straight(Green) ++
      2.turns() ++ 2.banks() ++ 2.straight(Green) ++
      3.turns() ++ 3.banks() ++ 3.straight(Green) ++ 3.tallons(Red) ++
      4.straight() ++ 4.kTurn(Red)
  )
  val ghost = Ship(Rebellion, "Ghost", "ghost", 8,
    1.turns(Red) ++ 1.banks() ++ 1.straight(Green) ++
      2.turns() ++ 2.banks(Green) ++ 2.straight(Green) ++
      3.turns(Red) ++ 3.banks() ++ 3.straight() ++
      4.straight() ++
      5.kTurn(Red)
  )
  val ghostAttackShuttle = Ship(Rebellion, "Ghost Attack Shuttle", "ghost-attack-shuttle", 8,
    1.turns(Red) ++ 1.banks(Green) ++ 1.straight(Green) ++
      2.turns() ++ 2.banks() ++ 2.straight(Green) ++
      3.turns(Red) ++ 3.banks() ++ 3.straight() ++
      4.straight() ++ 4.kTurn(Red)
  )

  val starViper = Ship(Scum, "StarViper", "starviper", 6,
    1.turns() ++ 1.banks(Green) ++ 1.straight(Green) ++
      2.turns() ++ 2.banks() ++ 2.straight(Green) ++
      3.banks() ++ 3.straight(Green) ++ 3.sloops(Red) ++
      4.straight()
  )
  val scyk = Ship(Scum, "M3-A Scyk", "scyk", 6,
    1.turns() ++ 1.banks() ++
      2.turns() ++ 2.banks(Green) ++ 2.straight(Green) ++
      3.banks() ++ 3.straight(Green) ++ 3.kTurn(Red) ++
      4.straight() ++
      5.kTurn(Red)
  )
  val ig2000 = Ship(Scum, "IG-2000", "ig-2000", 6,
    1.turns() ++ 1.banks(Green) ++ 1.straight(Green) ++
      2.turns() ++ 2.banks(Green) ++ 2.straight(Green) ++
      3.banks(Green) ++ 3.straight(Green) ++ 3.sloops(Red) ++
      4.kTurn(Red)
  )
  val houndsTooth = Ship(Scum, "YV-666 (Hound's Tooth)", "yv-666", 7,
    0.stop(Red) ++
      1.banks(Green) ++ 1.straight(Green) ++
      2.turns(Red) ++ 2.banks() ++ 2.straight(Green) ++
      3.turns() ++ 3.banks() ++ 3.straight(Green) ++
      4.straight()
  )
  val kihraxz = Ship(Scum, "Kihraxz Fghter", "kihraxz", 7,
    1.turns() ++ 1.banks(Green) ++
      2.turns() ++ 2.banks(Green) ++ 2.straight(Green) ++
      3.banks() ++ 3.straight() ++
      4.straight() ++ 4.kTurn(Red) ++
      5.kTurn(Red)
  )
  val mistHunter = Ship(Scum, "Mist Hunter", "mist-hunter", 8,
    1.turns(Red) ++ 1.banks(Green) ++ 1.straight(Green) ++
      2.turns()++ 2.banks() ++ 2.straight(Green) ++
      3.banks(Red) ++ 3.straight(Green) ++ 3.kTurn(Red) ++
      4.straight() ++ 4.kTurn(Red)
  )
  val punishingOne = Ship(Scum, "Punishing One", "punishing-one", 8,
    1.turn(left, Green) ++ 1.turn(right, White) ++ 1.bank(left, Green) ++ 1.bank(right, White) ++ 1.straight(Green) ++
      2.turn(left, Green) ++ 2.turn(right, White) ++ 2.bank(left, Green) ++ 2.bank(right, White) ++
        2.straight(Green) ++ 2.sloop(left, White) ++ 2.sloop(right, Red) ++
      3.banks() ++ 3.straight() ++
      4.straight() ++ 4.kTurn(Red)
  )

  val allShips = List(
    // glorious empire
    tieFighter,
    tieAdvanced,
    firespray,
    tieInterceptor,
    tieBomber,
    lambdaShuttle,
    tieDefender,
    tiePhantom,
    decimator,
    tiePunisher,
    tieFO,
    tieInquisitor,
    // rebels
    xWing,
    yWing,
    yt1300,
    aWing,
    bWing,
    hwk,
    z95,
    eWing,
    yt2400,
    kWing,
    t70,
    ghost,
    ghostAttackShuttle,
    // scum
    starViper,
    scyk,
    ig2000,
    houndsTooth,
    kihraxz,
    mistHunter,
    punishingOne
  )
}
