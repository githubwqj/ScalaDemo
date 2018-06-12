package com.wqj.scala.cases

/**
  * @Auther: wqj
  * @Date: 2018/6/11 17:52
  * @Description:
  */
object CaseDemo3 extends App {
  val arr = Array(1, 2, 3.5)

  arr match {
    case Array(1, x, y) => println(x + ":" + y)
    case Array(1, 2, 3) => println("应该不会有")
    case Array(1, _*) => println("1....")
    case _ => println("something")


  }

  //如果匹配不到 就会抛出异常
  val lst = List(0, 3, 111)
  lst match {
    case 0 :: Nil => println("only 0")
    case _ => println("something else")
  }


  //匹配元组
  val tup = (1, 3, 5)
  tup match {
    case (1, x, y) => println(s"$x,$y")
    case (_, z, 5) => println(s"$z")
    case _ => println("something else")
  }
}
