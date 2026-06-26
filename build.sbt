ThisBuild / scalaVersion := "3.3.7"

ThisBuild / organization := "lamora"

lazy val root = project
  .in(file("."))
  .settings(
    name                 := "lamora-backend",
    Compile / run / fork := true,
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio"                 % "2.1.26",
      "dev.zio" %% "zio-http"            % "3.11.2",
      "dev.zio" %% "zio-test"            % "2.1.26" % Test,
      "dev.zio" %% "zio-test-sbt"        % "2.1.26" % Test,
      "dev.zio" %% "zio-config"          % "4.0.7",
      "dev.zio" %% "zio-config-magnolia" % "4.0.7",
      "dev.zio" %% "zio-config-typesafe" % "4.0.7"
    ),
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  )
