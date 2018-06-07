package wqj.scala.grammar

/**
  * @Auther: wqj
  * @Date: 2018/6/7 15:30
  * @Description:
  */
object HelloScala {
  def main(args: Array[String]): Unit = {
    //        print(1 to 10)
    //    for (i <- 1 to 10) {
    //      println(i)
    //    }
    //    var arr = Array(1, 2, 3)
    //    for (a <- arr)
    //      println(a)

    //    for (i <-1 to 30;j <-1 to 3 if i !=j)
    //      println("i:"+i+"和"+"j:"+j+"---"+(10*i+j)+"")

    //    var t = for (i <- 1 to 10) yield i * 10
    //    print(t)
    //    print((1 to 10).map(_ * 10))


//    val a = Array(1, 2, 3, 4, 5, 6, 7, 8)
//    var b = for (i <- a if i % 2 == 0) yield i * 10
//    var c = for (i <- a) yield if (i % 2 == 0) i
//    println(a.mkString(" "))
//    println(b.mkString(" "))
//    println(c.mkString(" "))

//    val a = Array(1, 2, 3, 4, 5, 6, 7, 8)
//    print( a.filter(_ %2==0).mkString(","));
val a = Array(1, 2, 3, 4, 5, 6, 7, 8)
    print(0 until a.length)

  }
}
