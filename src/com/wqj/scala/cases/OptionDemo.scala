package com.wqj.scala.cases

/**
  * @Auther: wqj
  * @Date: 2018/6/12 14:31
  * @Description: 对于map操作的话 经常采用这个方法  map是映射
  *
  */
object OptionDemo extends App {
  val map = Map("a" -> 1, "b" -> 2)
  val map2 = ("a",1)
//  println(map)
//  println(map2)

  //原始方法
  val v =map.get("a") match{
      //如果其中有隐射的加  就返回some
    case Some(i) =>i
      //如果没有隐射 就返回None
    case None => 0
  }
  println(v)

  //更好的方式 已经封装 如果找不到的话 就是返回值自己填的那个值 例如-1
  val v1= map.getOrElse("b",-1)
  println(v1)

}
