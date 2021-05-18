package com.streese.interview4s

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class DummySpec extends AnyFreeSpec with Matchers {
  "This dummy test should work" in {
    1+1 shouldBe 2
  }
}
