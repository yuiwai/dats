scalaVersion in ThisBuild := "2.13.1"

lazy val stations = project
  .in(file("stations"))
  .settings(
    name := "dats-stations"
  )