package org.teavm.samples.scala

import cats.effect.{IO, IOApp}

object Client extends IOApp.Simple {
  override val run: IO[Unit] = IO.println("Hello Cats Effects!")
}
