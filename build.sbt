import sbtcrossproject.CrossPlugin.autoImport.crossProject

lazy val bar = crossProject(JSPlatform, JVMPlatform, NativePlatform)
  .settings(scalaVersion := "2.11.11")
  .nativeSettings(resolvers += Resolver.sonatypeRepo("snapshots"))

lazy val barJS     = bar.js
lazy val barJVM    = bar.jvm
lazy val barNative = bar.native
