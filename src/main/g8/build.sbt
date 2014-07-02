import android.Keys._

android.Plugin.androidBuild

name := "$name$"

versionCode := Some(1)

versionName := Some("0.1")

scalaVersion := "$scala_version$"

proguardOptions in Android ++= Seq(
  "-dontobfuscate",
  "-dontoptimize"
)

libraryDependencies ++= Seq(
//  "com.netflix.rxjava" % "rxjava-core" % "latest.integration",
//  "com.netflix.rxjava" % "rxjava-scala" % "latest.integration" intransitive(),
//  "com.netflix.rxjava" % "rxjava-android" % "latest.integration" intransitive(),
  "org.macroid" %% "macroid" % "2.0.0-M1"
)

platformTarget in Android := "$target$"

run <<= run in Android

install <<= install in Android
