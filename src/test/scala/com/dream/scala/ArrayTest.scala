package com.dream.scala

import scala.collection.mutable.ArrayBuffer

class ArrayTest {
}

object ArrayTest {
  val name = "aaaa"


  def main(args: Array[String]): Unit = {
    val arr = new Array[Int](10)
    println(arr.toBuffer)
    val arr2 = Array("hadoop", "spark", "storm")
    arr2.sortWith(_.length > _.length).reverse
    println(arr2.toBuffer)
    var ab = ArrayBuffer("hadoop", "spark", "storm")
    var bc = ArrayBuffer("hadoop", "spark", "storm")
    ab += "kafka"
    println(ab)
    ab(1) = "kafka"
    println(ab)
    ab ++= bc
    println(ab)
    ab.insert(1, "2", "3", "4")
    println(ab)
    ab.remove(1)
    println(ab)
    for (index <- (0 until ab.length).reverse)
      println(index)
    val res = ab.map(println)
    println(res)
  }

}
