package com.dream.scala.base

class MethodTransFun {

}

object MethodTransFun {
  def main(args: Array[String]): Unit = {

  }

  def m2(name: String): String = name + "你好"

  //将方法转换为函数
  val f2 = m2 _

}
