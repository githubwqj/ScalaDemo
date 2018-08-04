package com.wqj.scala.grammar

/**
  * @Auther: wqj
  * @Date: 2018/8/4 11:14
  * @Description:
  */
class SparkInterViewTest1(private[grammar] val name: String) {
  private def show(das:String): Unit ={
    print(s"show:$das")
  }
  private[grammar] def show2(das:String): Unit ={
    print(s"show:$das")
  }
  println(name)
  println("1111111")
}

object SparkInterViewTest1 {
  def apply(): SparkInterViewTest1 = new SparkInterViewTest1("sz")

  val name2=new SparkInterViewTest1("11").name
  def apply(name: String): SparkInterViewTest1 = new SparkInterViewTest1(name)
}