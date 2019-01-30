package com.dream.scala

import scala.collection.mutable.Map

class MapTest {

}

object MapTest {
  def main(args: Array[String]): Unit = {
    val map = Map("name" -> "张三", "age" -> 25)
    map("name") = "李四"
    map += ("email" -> "343618924@qq.com")
    map += (("address", "成都"))
    map.remove("name")
    println(map)
    val m = Map(("", 1))
    println(m)

  }
}

