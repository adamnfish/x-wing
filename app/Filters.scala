import javax.inject._

import filters.HstsFilter
import play.api._
import play.api.http.HttpFilters


@Singleton
class Filters @Inject() (
  env: Environment,
  hstsFilter: HstsFilter) extends HttpFilters {

  override val filters = {
    if (env.mode == Mode.Prod) Seq(hstsFilter) else Seq.empty
  }

}
