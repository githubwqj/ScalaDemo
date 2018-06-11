package wqj.scala.toobject

import scala.io.Source

/**
  * @Auther: wqj
  * @Date: 2018/6/10 10:59
  * @Description:
  */
class MissRight {

  print(123)

  //读取文件
  Source.fromFile("")
}

object MissRight{

  def apply: Unit ={
    println("1")
  }
  def apply(a:Int,b:String):Unit={

    println(b)
  }


  def main(args: Array[String]): Unit = {
//    val cc=MissRight(2,"123213")
//    println(cc)
    val cc=MissRight
    println(cc)
  }
}
