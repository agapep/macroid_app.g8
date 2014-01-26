import android.Keys._

android.Plugin.androidBuild

name := "$name$"

version := "$version$"

scalaVersion := "$scala_version$"

proguardOptions in Android ++= Seq(
  "-dontobfuscate",
  "-dontoptimize"
)

libraryDependencies ++= Seq(
)

run <<= run in Android

install <<= install in Android