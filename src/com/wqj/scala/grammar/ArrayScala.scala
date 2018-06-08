package com.wqj.scala.grammar

import scala.collection.mutable.ArrayBuffer

/**
  * @Auther: wqj
  * @Date: 2018/6/8 09:39
  * @Description:
  */
object ArrayScala {

  def main(args: Array[String]): Unit = {
    //长度为10的元素整数数组,所有的初始化为0
    //    val numArr = new Array[Int](10)
    //    numArr(0)=2
    //    val ab = ArrayBuffer[Int]()
    //
    //    ab +=(2,4,5)
    //    ab ++=Array(6,7,8)
    //    println(ab)
    //
    //    //移除后面一个元素
    //    ab.trimEnd(1)
    //    println(ab)
    //    ab.insert(1,22,33)
    //    println(ab)
    //    ab.remove(1)
    //    println(ab)

    val arr1 = Array(1, 2, 4, 3, 5, 6, 7, 8)
    //遍历数组
    //    for (i <- 0 until arr1.length) {
    //      println(arr1(i))
    //    }
    //
    //    //遍历特定步长 遍历数据 eg:隔两个遍历一次
    //    for (i <- 0 until(arr1.length, 2)) {
    //      print(arr1(i))
    //    }

    //逆向循环
    //    for (i <- (0 until arr1.length).reverse) {
    //      println(arr1(i))
    //    }
    //
    //    for (i <- arr1) {
    //      println("直接遍历不适用下标:" + i)
    //    }

    val change = for (i <- arr1) yield i * 2
    //    println(change.toBuffer)
    //
    //    println(change.max)
    //    println(change.min)

    val arr2 = arr1.sorted
    //    print(arr2.toBuffer)

    val arr3=Array.ofDim[Int](2,3)
    println(arr3.toBuffer)
    println(arr3.length)
    println(arr3(0).length)

  }

}
