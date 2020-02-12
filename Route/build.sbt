enablePlugins(ScalaJSBundlerPlugin)

enablePlugins(ScalaJSPlugin)

libraryDependencies += "com.lihaoyi" %%% "upickle" % "0.9.8"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.0.0"

libraryDependencies += "com.thoughtworks.binding" %%% "binding" % "12.0.0-M0"

libraryDependencies += "org.scalatest" %%% "scalatest" % "3.1.0" % Test

requireJsDomEnv in Test := true
