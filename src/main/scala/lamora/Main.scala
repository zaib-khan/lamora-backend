package lamora

import lamora.http.HealthRoutes
import zio.*
import zio.http.*

object Main extends ZIOAppDefault:

  def run: ZIO[Any, Throwable, Nothing] =
    Server
      .serve(HealthRoutes.routes)
      .provide(Server.default)
