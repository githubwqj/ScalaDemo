package com.wqj.scala.cases

/**
  * @Auther: wqj
  * @Date: 2018/8/5 20:13
  * @Description:
  */
class CaseD {

  def switch1(para: Any): Any = {
    para match {
      case student1(a, b) => {
        println(s"s1$a,$b")
        (a, b)
      }
      case student2(a, b) => {
        println(s"s2$a,$b")
        (a, b)
      }
      case student3(a, b) => {
        println(s"s3$a,$b")
        (a, b)
      }

    }


  }
}
