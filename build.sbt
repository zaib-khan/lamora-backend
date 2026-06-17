ThisBuild / scalaVersion := "3.3.7"

ThisBuild / organization := "lamora"

lazy val root = project
  .in(file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := "lamora-backend",
    libraryDependencies ++= Seq(
      guice
    )
  )