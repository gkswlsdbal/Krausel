ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "Manager"
  )

name:="spark-sample"

version:="0.1"

scalaVersion:="2.13.8"

val sparkVersion="3.2.0"

libraryDependencies ++=Seq("org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion)