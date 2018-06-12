package com.wqj.scala.cases

import scala.util.Random

/**
  * @Auther: wqj
  * @Date: 2018/6/12 12:08
  * @Description:  通过类去找case  这个是最常用的
  */
case class SubmitTask(id: String, name: String)

case class HeartBeat(time: Long)

case object CheckTimeOutTask

object CaseDemo4 extends App {

  val arr = Array(CheckTimeOutTask, HeartBeat(12332), SubmitTask("1", "2"))

  arr(Random.nextInt(arr.length)) match {
    case SubmitTask(id,name) => println(s"$id,$name")
    case HeartBeat(aaa) => println(s"$aaa")
    case CheckTimeOutTask => println("object")
    case _ =>println("没有匹配到")
  }
}
