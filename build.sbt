ThisBuild / scalaVersion := "3.3.7"

ThisBuild / organization := "lamora"

lazy val root = project
  .in(file("."))
  .settings(
    name := "lamora-backend"
  )