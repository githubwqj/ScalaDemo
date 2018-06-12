package com.wqj.scala.cases

import scala.util.Random

/**
  * @Auther: wqj
  * @Date: 2018/6/11 17:23
  * @Description: 匹配内容
  */
object CaseDemo1 extends App {

  val arr = Array("hahaha", "111", "2222")
  val matcher = arr(Random.nextInt(arr.length))
  println("chushi:" + matcher)

  matcher match {
    case "hahaha" => println("aaa")
    case "111" => println("bbb")
    case _ => println("ccc")

  }
}
