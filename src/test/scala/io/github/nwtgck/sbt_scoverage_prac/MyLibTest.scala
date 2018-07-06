package io.github.nwtgck.sbt_scoverage_prac

import org.scalatest.{FunSuite, Matchers}

class MyLibTest extends FunSuite with Matchers{
  test("myAdd"){
    MyLib.myAdd(1, 2) shouldBe 3
  }
}
