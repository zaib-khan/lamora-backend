ThisBuild / scalaVersion := "3.3.7"

ThisBuild / organization := "lamora"

lazy val root = project
  .in(file("."))
  .settings(
    name                 := "lamora-backend",
    Compile / run / fork := true,
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio"          % "2.1.26",
      "dev.zio" %% "zio-http"     % "3.11.2",
      "dev.zio" %% "zio-test"     % "2.1.26" % Test,
      "dev.zio" %% "zio-test-sbt" % "2.1.26" % Test,
      "org.scalameta" % "sbt-scalafmt_2.12_1.0" % "2.6.1"
    ),
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  )


