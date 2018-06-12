package com.wqj.scala.myactor1

import scala.actors.Actor
import scala.collection.mutable
import scala.concurrent.Future
import scala.io.Source

/**
  * @Auther: wqj
  * @Date: 2018/6/12 16:10
  * @Description: //已经被废弃
  *
  *               !	发送异步消息，没有返回值。
  *               !?	发送同步消息，等待返回值。
  *               !!	发送异步消息，返回值是 Future[Any]。
  *
  */
class Task extends Actor {
  override def act(): Unit = {
    loop {
      react {
        case SubmitTask(a, b) => {
          //通过io,为了避免  //先局部的计算  再试后面的进行汇总
          val result = Source.fromFile(a, "utf-8").getLines()
            .flatMap((_.split(" ").map((_, 1)))).toArray.groupBy(_._1)
            .mapValues(c => (c.foldLeft(0)(_ + _._2)))

          //将运算结果直接返回
          sender ! ResultTask(result)
        }

        case StopTask =>
          exit()
      }
    }
  }
}

case class SubmitTask(filename: String, id: Int)

case class ResultTask(map: Map[String, Int])

case object StopTask


object ActorWordCount {
  val files = Array[String]("e://word.txt", "e://words.log")

  val replySet = new mutable.HashSet[Future[Any]]()
  for (f <- files) {
    //启动actor
    val actor = new Task
    //启动并发送异步消息,无返回值
    actor.start() ! SubmitTask(f, 1)
    //异步 返回feature
    val fea = actor.start() !! SubmitTask(f, 1)

    //    replySet += fea


  }


  while (replySet.size > 0) {
    //是否完成
    val toCompute = replySet.filter(_.isCompleted)

    for (tc <- toCompute) {
      //强转
      //      tc.apply().asInstanceOf(ResultTask)

      //处理之后 将这个元素删除掉,知道while循环为空的时候  结束这次,将数据汇总
    }
  }
}
