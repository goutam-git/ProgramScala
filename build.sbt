name := """hello-scala"""

version := "2.0"

scalaVersion := "2.11.7"


libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.9" % "test->default",
  "org.mockito" % "mockito-core" % "1.9.5"
)


fork in run := true