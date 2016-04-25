package controllers

import javax.inject._
import data.Ships
import play.api._
import play.api.mvc._
import logic.ShipLogic._


@Singleton
class HomeController @Inject() extends Controller {
  def index = Action {
    // Make a home page when there's something to say on it
    SeeOther("/choose-ships")
  }

  def chooseShips = Action {
    Ok(views.html.chooseShips(Ships.allShips))
  }

  def hud = Action { implicit request =>
    // TODO read from submission
    val shipCodes = shipcodesFromQueryString(request.rawQueryString)
    val ships = lookupShips(Ships.allShips, shipCodes)
    Ok(views.html.hud(ships))
  }
}
