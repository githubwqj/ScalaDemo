package com.wqj.scala.toobject

/**
  * @Auther: wqj
  * @Date: 2018/6/9 16:59
  * @Description:
  */
class Person {
  val id = 1

  val name = "张三"

  private var sex  ="女"

  //加了this之后 只能在本类中访问
  private[this] var dept:String = "111"

  def usePrivate:Unit={
    println(sex)
    println(dept)
  }
}
object Person{
  def main(args: Array[String]): Unit = {
    var a= new Person
    a.usePrivate
    a.sex
    print(a.id)
  }
}