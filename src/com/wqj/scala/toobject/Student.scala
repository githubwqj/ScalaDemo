package com.wqj.scala.toobject

/**
  * @Auther: wqj
  * @Date: 2018/6/9 18:16
  * @Description:
  */
class Student(val id : String,var name: String,sex :String,val age: Int = 18) {
//相当于 private[this]
  println("fff")
}


object Student {

  def main(args: Array[String]): Unit = {
    val a=new Student("123","345","nan",20)
//    a.id="121"
//    a.name="34"
    print(a.age)
  }
}
