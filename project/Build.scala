import sbt._
import Keys._

object Resolvers {
}
 
object Dependencies {
   val appDependencies = Seq(
      "com.typesafe.akka" %% "akka-actor"  % "2.3.7"
   )
}
 
object BuildSettings {
 
   val buildOrganization = "com.github.scalable_tech"
   val appName = "stumps-messgaes"
   val buildVersion = "0.0.1-SNAPSHOT"
   val buildScalaVersion = "2.11.4"
   val buildScalaOptions = Seq("-unchecked", "-deprecation", "-encoding", "utf8")
 
   import Resolvers._
   import Dependencies._

   val buildSettings = Defaults.defaultSettings ++ Seq(
      organization         := buildOrganization,
      version              := buildVersion,
      scalaVersion         := buildScalaVersion,
      libraryDependencies ++= appDependencies,
      scalacOptions        := buildScalaOptions
   )
}
 
object ApplicationBuild extends Build {
 
   import BuildSettings._
 
   lazy val main = Project(
      appName,
      file("."),
      settings = buildSettings)
}
