lazy val commonsettings = Seq(
    organization := "net.garethrogers",
    version := "1.0",
    scalaVersion := "2.11.7"
)
lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "projecteuler"
  )