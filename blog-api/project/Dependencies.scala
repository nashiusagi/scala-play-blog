import sbt._

object Dependencies {
  object dev {
    object zio {
      val zio = "dev.zio" %% "zio" % "2.0.4"
    }
  }

  object org {
    object scalatest {
      val scalatest =
        "org.scalatest" %% "scalatest" % "3.2.14"
    }

    object scalatestplus {
      val `scalacheck-1-16` =
        "org.scalatestplus" %% "scalacheck-1-16" % "3.2.14.0"
    }
  }
}
