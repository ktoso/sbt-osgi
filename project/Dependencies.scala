import sbt._

object Library {

  // Versions
  val bndVersion = "2.4.0"
  val specs2Version = "3.9.4"

  // Libraries
  val bndLib = "biz.aQute.bnd" % "bndlib" % bndVersion
  val specs2 = "org.specs2" %% "specs2-core" % specs2Version
}

object Dependencies {

  import Library._

  val sbtOsgi = List(
    bndLib,
    specs2 % "test")
}
