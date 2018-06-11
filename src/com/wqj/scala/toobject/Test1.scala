package wqj.scala.toobject

/**
  * @Auther: wqj
  * @Date: 2018/6/10 11:46
  * @Description: 一旦继承了App的话 就不用些main方法了
  *
  */
object Test1 extends App {
  println(1111)

  println(method("李四"))

  def method(a: String): String = {
    println("进入到此方法")
    a
  }

}
