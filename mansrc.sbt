ThisBuild/scalaSrc := "3.0.1" 

val GraphicsJvm = Project("GraphicsJvm", "SbtDir/GraphicsJvm").setttings(
  Compile/scalaSrc := (ThisBuild/baseDirectory).value / "Graphics/src"
)

val GraphicsJs = Project("GraphicsJs", "SbtDir/GraphicsJs")