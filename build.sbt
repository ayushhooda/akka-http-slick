name := "akka-http-slick"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http" % "10.1.1",
  "com.typesafe.akka" %% "akka-http-spray-json" % "10.1.1",
  "com.typesafe.akka" %% "akka-http-xml" % "10.1.1",
  "com.typesafe.akka" %% "akka-stream" % "2.5.12",
  "com.typesafe.akka" %% "akka-http-testkit" % "10.1.1" % Test,
  "com.typesafe.akka" %% "akka-testkit" % "2.5.12" % Test,
  "com.typesafe.akka" %% "akka-stream-testkit" % "2.5.12" % Test,
  "org.scalatest" %% "scalatest" % "3.0.1" % Test,
  "com.typesafe.slick" %% "slick" % "3.2.3",
  "com.google.inject" % "guice" % "3.0",
  "ch.megard"  %% "akka-http-cors" % "0.2.2",
  "mysql" % "mysql-connector-java" % "8.0.11",
  "com.h2database" % "h2" % "1.4.197"
)