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
//    println(endresult)


    val b=List(1,2,3,4,5,6,7)
//    println(b.toArray.reduce(_+_))
//    println(b.fold(10)(_+_))
//    println(b.toArray.par.reduce(_+_))
//    println(b.par.fold(0)(_+_))
//    //并行计算
//    println(b.par.fold(10)(_+_))


    //简陋方法
    val c1=lines.flatMap(_.split(" ")).map((_,1)).groupBy(_._1).mapValues(t => t.size)
//    println(c1)
//    print(lines.flatMap(_.split(" ")).map((_,1)).groupBy(_._1))
    //升级方法
    val c2=lines.flatMap(_.split(" ")).map((_,1)).groupBy(_._1).mapValues(t =>t.foldLeft(0)(_+_._2))

//    println(c2)

    val c3=c2.toArray.sortBy(_._2).reverse.map(t => (t._2,t._1))
//    print(c3.toBuffer)

//    val c3=lines.flatMap(_.split(" ")).map((_,1)).groupBy(_._1).mapValues(t =>t.reduce()

//    print(c3)




    //聚合
//    val arr = List(List(1, 2, 3), List(3, 4, 5), List(2), List(0))
//    print(arr.par.aggregate(0)(_+_.sum,_+_))


    val l1 = List(5,6,4,7)
    val l2 = List(1,2,3,4)

    //求并集 (元素会重复)
    println(l1.union(l2))
    //求交集
    println(l1.intersect(l2))
    //求差集
    println(l1.diff(l2))





  }
}
