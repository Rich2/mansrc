ThisBuild/scalaVersion := "3.0.1" 

val GraphicsJvm = Project("GraphicsJvm", file("SbtDir/GraphicsJvm")).settings(
  Compile/scalaSource := (ThisBuild/baseDirectory).value / "Graphics/src",
  Compile/unmanagedSourceDirectories := List((ThisBuild/baseDirectory).value / "Graphics/src", (ThisBuild/baseDirectory).value / "Graphics/srcJvm"),
)

val GraphicsJs = Project("GraphicsJs", file("SbtDir/GraphicsJs")).settings(
  Compile/unmanagedSourceDirectories := List((ThisBuild/baseDirectory).value / "Graphics/src"),

  Compile / sourceGenerators += Def.task {
  val rectStr = scala.io.Source.fromFile("Graphics/srcJvm/Rect.scala").mkString
  val rect = (Compile / sourceManaged).value / "Js" / "Rect.scala"
	  IO.write(rect, rectStr)

  	/*val file = (Compile / sourceManaged).value / "Js" / "Test.scala"
	  IO.write(file, """object Test extends App { println("Hi") }""")*/
	  Seq(rect)
  }.taskValue,
)