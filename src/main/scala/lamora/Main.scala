package lamora

import lamora.config.LamoraConfig
import lamora.http.HealthRoutes
import zio.*
import zio.http.*
import lamora.starter.AsciiBanner.*
import zio.config.typesafe.*

object Main extends ZIOAppDefault:

  override val bootstrap: ZLayer[ZIOAppArgs, Any, Any] =
    Runtime.setConfigProvider(ConfigProvider.fromResourcePath())

  def run: ZIO[Any, Throwable, Nothing] = {
    for {
      // _   <- displayRandomBanner
      config <- ZIO.config(LamoraConfig.descriptor)
      res <- Server
        .serve(HealthRoutes.routes)
        .provide(Server.configured())
    } yield res
  }
