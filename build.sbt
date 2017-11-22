sbtPlugin := true
scalaVersion in ThisBuild := "2.12.4"

name := "sbt-spring-loaded"
organization := "com.jc776"
version := "0.0.1-SNAPSHOT"

licenses := Seq("GPLv3" -> url("http://www.gnu.org/licenses/gpl-3.0.txt"))
homepage := Some(url("http://github.com/jc776/sbt-spring-loaded"))

addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.0")

libraryDependencies ++= Seq(
  "org.springframework" % "springloaded" % "1.2.5.RELEASE"
)





