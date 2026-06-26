package lamora.config

import zio.Config

final case class LamoraConfig(
    applicationName: String,
    environment: String
)

object LamoraConfig:

  val descriptor: Config[LamoraConfig] =
    (
      Config.string("application-name") ++
        Config.string("environment")
    )
      .map(LamoraConfig.apply)
      .nested("lamora")
