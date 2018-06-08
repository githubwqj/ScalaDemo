package com.wqj.scala.grammar

/**
  * @Auther: wqj
  * @Date: 2018/6/8 15:03
  * @Description:
  */
object ListScala {


  def main(args: Array[String]): Unit = {
    val list1 = List(1, 7, 9, 8, 0, 3, 5, 4, 6, 2)
    val b = list1.map(_ * 10)
    //    print(b.toBuffer)


    //    var e= (x: Int) => x%2==0
    //    val c= list1.filter(e)
    //    print(c.toBuffer)

    //    var c=  list1.sorted
//        val c1= list1.sortBy(x=> x)
    //    print(c)

    //将元素4各个为一组,返回的类型Iterator[List[Int]]
    val it = list1.grouped(4)
//    print(it.toBuffer)
    //将Iterator转成list
    val lt2=it.toList
    println(lt2)
//    将多个list压成一个list
    val it3=lt2.flatten
    println(it3)

    //先按空格切分,在压平

  }

}
