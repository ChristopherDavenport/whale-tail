package io.chrisdavenport.whaletail

import org.specs2._
import cats.effect._

object MainSpec extends mutable.Specification {

  "Main" should {
    "run a println" in {
      ok
      // Main.run(List.empty[String]).unsafeRunSync.should_===(ExitCode.Success)
    }
  }

}