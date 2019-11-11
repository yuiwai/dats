scalaVersion in ThisBuild := "2.13.1"
organization in ThisBuild := "com.yuiwai"
version in ThisBuild := "0.1.0-SNAPSHOT"

lazy val stations = project
  .in(file("stations"))
  .settings(
    name := "dats-stations",
    crossScalaVersions := Seq("2.11.11", "2.12.8", "2.13.1")
  )

lazy val comics = project
  .in(file("comics"))
  .settings(
    name := "dats-comics"
  )