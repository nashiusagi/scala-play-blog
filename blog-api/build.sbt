import Dependencies._

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := "blog-api",
    scalaVersion := "3.3.0-RC4",
    libraryDependencies += guice
  )
  .settings(commonSettings)
  .settings(scala3Settings)
  .settings(dependencies)

//Compile / run / fork := true

lazy val scala3Settings =
  Seq(
    scalacOptions ++= Seq(
      "-feature",
      "-Werror"
    )
  )

lazy val commonSettings = {
  lazy val commonScalacOptions = Seq(
    Compile / console / scalacOptions --= Seq(
      "-Wunused:_",
      "-Xfatal-warnings"
    ),
    Test / console / scalacOptions :=
      (Compile / console / scalacOptions).value
  )

  Seq(
    commonScalacOptions
  ).reduceLeft(_ ++ _)
}

lazy val dependencies = Seq(
  libraryDependencies ++= Seq(
    org.scalatest.scalatest,
    org.scalatestplus.`scalacheck-1-16`
  ).map(_ % Test)
)
