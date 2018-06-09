package com.wqj.scala.toobject

/**
  * @Auther: wqj
  * @Date: 2018/6/9 16:59
  * @Description:
  */
class Person {
  val id = 1

  val name = "张三"



}
object test{
  def main(args: Array[String]): Unit = {
    var a= new Person
    print(a.id)
  }
}