package com.wqj.scala.toobject

/**
  * @Auther: wqj
  * @Date: 2018/6/11 10:24
  * @Description: trait类似于java8的接口
  */
trait Animal {

  //在接口中以实现的方法
  def run:Unit ={

    print("I Am A Animal")

  }

  //抽象方法
  def abrun()

  //抽象方法有参数
  def abrun(a:Int) :String
}
