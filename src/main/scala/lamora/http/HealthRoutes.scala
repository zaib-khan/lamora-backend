package lamora.http

import zio.http.*

object HealthRoutes:

  val routes: Routes[Any, Nothing] =
    Routes(
      Method.GET / "health" ->
        handler(Response.text("Lamora backend is running"))
    )