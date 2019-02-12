package com.dream.scala.base

class MethodFunTest2 {

}


object MethodFunTest2 {

  val func = (x: Int) => x * 10

  def m1(f: Int => Int): Int = {
    f(3)
  }

  def main(args: Array[String]): Unit = {
    val res1 = m1(func)
    println(res1)

    val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val r1 = arr.map(x => x + 5)
    val r2 = arr.map(x => x + 1)
    println(r1.toBuffer)
    println(r2.toBuffer)
    println(arr.toBuffer)


    val func2: Int => String = { x => x.toString }

    //         参数类型              返回类型           方法体
    val fun3: (Int, Double) => (Double, Int) = { (a, b) => (b, a) }


    println(func2(10))


    def m2(name: String): Unit = {
      println(name)
    }

    val res = m2("张三")
    println(res)
  }
}


