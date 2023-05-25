ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

val flinkVersion = "1.17.ещг0"
val logbackVersion = "1.4.6"

val flinkDependencies = Seq(
  "org.apache.flink" % "flink-streaming-java" % flinkVersion,
  "org.apache.flink" % "flink-clients" % flinkVersion
)

val logbackDependencies = Seq(
  "ch.qos.logback" % "logback-core" % logbackVersion,
  "ch.qos.logback" % "logback-classic" % logbackVersion
)


lazy val root = (project in file("."))
  .settings(
    name := "scala-flink",
    idePackagePrefix := Some("ru.nsamartsev.scala"),
    libraryDependencies ++= flinkDependencies ++ logbackDependencies
  )
