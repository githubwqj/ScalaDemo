package com.wqj.scala.cases

/**
  * @Auther: wqj
  * @Date: 2018/8/5 19:30
  * @Description: 测试scala的模式匹配
  */
case class student1(id:String,name:String)
case class student2(id:String,name:String)
case class student3(id:String,name:String)
object TestSwitch {
  def main(args: Array[String]): Unit = {
//    val i =2
//    i match {
//      case 1=> print(1)
//      case 2=> print(2)
//      case _=> print(3)
//    }
  val case1=new CaseD
    print(case1.switch1(student1("1","2")))
  }
}

