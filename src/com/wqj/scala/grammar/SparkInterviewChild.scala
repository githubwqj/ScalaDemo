package com.wqj.scala.grammar

/**
  * @Auther: wqj
  * @Date: 2018/8/4 14:56
  * @Description:
  */
class SparkInterviewChild {

  var name = 2
  var int = 1
}

class SparkInterviewChild2 extends SparkInterviewChild {
  println("diyici" + name)

  def show(): Unit = {
    println("dierci" + name)

  }

}
object SparkInterviewChild2 {
  def show( name:String): Unit ={
    println("object" + name)
   new SparkInterviewChild2().show()
  }
}