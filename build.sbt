ThisBuild / organization := "com.streese"
ThisBuild / scalaVersion := "2.13.5"
ThisBuild / version      := "0.1.0-SNAPSHOT"

lazy val interview4s = (project in file("."))
  .settings(
    name                 := "interview4s",
    libraryDependencies ++= libs
  )

lazy val libFs2       = "co.fs2"        %% "fs2-core"  % "2.5.3"
lazy val libScalatest = "org.scalatest" %% "scalatest" % "3.2.8" % "test"

lazy val libs = Seq(
  libFs2,
  libScalatest
)

ThisBuild / scapegoatVersion := "1.4.8"
