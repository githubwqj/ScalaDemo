package wqj.scala.grammar

/**
  * @Auther: wqj
  * @Date: 2018/6/7 15:30
  * @Description:
  */
object HelloScala {
  def main(args: Array[String]): Unit = {
    //        print(1 to 10)
    for (i <- 1 to 10) {
      println(i)
    }
    var arr = Array(1, 2, 3)
    for (a <- arr)
      print(a)


  }
}
