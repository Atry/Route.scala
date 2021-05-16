enablePlugins(ScalaJSBundlerPlugin)

enablePlugins(ScalaJSPlugin)

libraryDependencies += "com.lihaoyi" %%% "upickle" % "1.3.14"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.0.0"

libraryDependencies += "com.thoughtworks.binding" %%% "binding" % "12.0.0"

libraryDependencies += "org.scalatest" %%% "scalatest" % "3.1.2" % Test

requireJsDomEnv in Test := true
