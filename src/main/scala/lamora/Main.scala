package lamora

import lamora.http.HealthRoutes
import zio.*
import zio.http.*
import lamora.starter.AsciiBanner._

object Main extends ZIOAppDefault:

  private val port = 8081

  def run: ZIO[Any, Throwable, Nothing] = {
    for {
      _   <- displayRandomBanner
      _   <- ZIO.logInfo(s"Lamora backend started on http://localhost:$port")
      res <- Server
        .serve(HealthRoutes.routes)
        .provide(Server.defaultWithPort(port))
    } yield res
  }
