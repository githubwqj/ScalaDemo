package wqj.scala.grammar

/**
  * @Auther: wqj
  * @Date: 2018/6/7 18:01
  * @Description:
  */
object methodScala {

  def m1(a:Int,b:Int):Int = {


//    return a*b
     a*b
  }

  def main(args: Array[String]): Unit = {
    print(m2(func))
  }


  def m2 (f:Int => Int ): Int ={

    f(3)
  }
  val func = (x : Int) => x*100
}
