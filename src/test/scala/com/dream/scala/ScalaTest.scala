package com.dream.scala

class ScalaTest {

}

object ScalaTest {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 2, 3, 4)
    for (index <- 0 until arr.length) {
      println(index + ":" + arr(index))
    }
    val res1 = arr.filter(_ % 2 == 0)
    for (x <- res1) {
      println(x)
    }
  }
}
