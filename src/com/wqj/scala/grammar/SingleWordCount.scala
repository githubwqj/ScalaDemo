package com.wqj.scala.grammar

/**
  * @Auther: wqj
  * @Date: 2018/6/8 16:30
  * @Description:
  */
object SingleWordCount {

  def main(args: Array[String]): Unit = {
    val lines = List("hello tom hello jerry", "hello jerry", "hello kitty")
    //1.先字符串改成数组
    lines.map(_.split(" "))
    //    println(lines.map(_.split(" ").toBuffer).toBuffer)
    //2.将数组平铺
    lines.map(_.split(" ")).flatten


    //一个简便方法
    val words = lines.flatMap(_.split(" "))
    //将其变成map
    val wordmaps = words.map((_, 1))

    //_._1map的key _._2 map的value
    val wordcountmap = wordmaps.groupBy(_._1);
    val wordcount = wordcountmap.map(t => (t._1, t._2.size))
    val endresult = wordcount.toList.sortBy(_._2).reverse
    println(endresult)
  }
}
