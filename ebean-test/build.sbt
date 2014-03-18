name := "ebean-test"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  //javaJdbc,
  //javaEbean,
  javaJpa,
  cache
)

libraryDependencies += "org.hibernate" % "hibernate-entitymanager" % "4.3.4.Final"

play.Project.playJavaSettings
