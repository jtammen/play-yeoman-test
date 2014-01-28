import sbt._
import Keys._
import play.Project._
import com.tuplejump.sbt.yeoman.Yeoman

object ApplicationBuild extends Build {

    val appName         = "play-yeoman-test"
    val appVersion      = "1.0"

    val appDependencies = Seq(
       javaCore, javaJdbc, javaEbean
    )

    val main = play.Project(appName, appVersion, appDependencies).settings(
		(Yeoman.yeomanSettings ++ Yeoman.withTemplates) : _*
    )
}
