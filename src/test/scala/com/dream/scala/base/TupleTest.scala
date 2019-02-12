package com.dream.scala.base

class TupleTest {

}

object TupleTest {
  def main(args: Array[String]): Unit = {
    var m = Map("a" -> 19)
    val tuple = (1, 2, "张三", 2.5)
    val one = tuple._1
    println(one)
    m += (("b", 12), ("c", 28))
    println(m)
    //tuple转换为map
    val arr = Array(("age", 25))
    val map = arr.toMap
    println(map)
  }
}

