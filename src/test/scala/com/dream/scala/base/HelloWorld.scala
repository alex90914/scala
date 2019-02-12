package com.dream.scala.base

class HelloWorld {

}


object HelloWorld {
  def main(args: Array[String]): Unit = {
    val x = 0
    val y = if (x > 1) 1 else "sss"
    println(y)
    //==================================================
    val res = 1 to 10
    for (x <- res) {
      println(x)
    }
    val arr = Array(1, 2, 3)
    for (x <- arr) {
      println(x)
    }
    //yield 生成一个新的集合
    val v = for (i <- 1 to 10; if (i % 2 == 0)) yield i * 10;
    for (x <- v) {
      println(x)
    }
  }
}
