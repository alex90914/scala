package com.dream.scala

class MethodFunTest {

}

object MethodFunTest {
  def main(args: Array[String]): Unit = {
    //方法
    def m1(a: Int, b: Int) = a * b

    println(m1(12, 12))
    //函数
    val fun1 = (x: Int, y: Int) => x + y
    println(fun1(12, 12))
    val arr = 1 to 10

    val multiply10 = (x: Int) => x * 10
    //将函数作为参数
    var multiply10Arr = arr.map(multiply10)
    multiply10Arr = arr.map(x => x * 10)
    println(multiply10Arr)



  }
}
