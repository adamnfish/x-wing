package controllers

import javax.inject._
import data.Ships
import play.api._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject() extends Controller {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }


  def chooseShips = Action {
    Ok(views.html.chooseShips(Ships.allShips))
  }

  def hud = Action {
    // TODO read from submission
    val ships = Ships.allShips
    Ok(views.html.hud(ships))
  }

}
