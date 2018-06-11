package com.wqj.scala.toobject

/**
  * @Auther: wqj
  * @Date: 2018/6/11 10:22
  * @Description:
  */
class Chinese extends  Human with Animal {
  override def abrun(): Unit = {
    print("chiness:de run fangfa" )
  }

  override def abrun(a: Int) = ???
}

object Chinese{

  def main(args: Array[String]): Unit = {
     val chinese = new Chinese
    chinese.exchange
  }
}



