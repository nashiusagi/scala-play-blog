lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := "blog-api",
    scalaVersion := "3.3.0-RC4",
    libraryDependencies ++= Seq(
      "org.scalatestplus.play" %% "scalatestplus-play" % "6.0.0-M3" % Test,
    ),
    libraryDependencies += guice,
    scalacOptions ++= Seq (
      "-deprecation",
      "-feature",
      "-unchecked"
    )
  )

//Compile / run / fork := true
