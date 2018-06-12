package com.wqj.scala.cases

import scala.util.Random

/**
  * @Auther: wqj
  * @Date: 2018/6/11 17:37
  * @Description: 匹配类型
  */
object CaseDemo2 extends App {

  val arr=Array("hello",1,-2.0,CaseDemo1)
  val elem=arr(Random.nextInt(arr.length))
  elem match {
    case x: Int=>print("Int:"+x)
    case y: Double =>print("Double"+y)
    case z:String =>print("String"+z)
    case _=>throw  new Exception("没有找到对应的适配器")
  }
}
