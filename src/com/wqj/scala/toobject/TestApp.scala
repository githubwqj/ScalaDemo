package wqj.scala.toobject

/**
  * @Auther: wqj
  * @Date: 2018/6/10 11:46
  * @Description:
  */
class TestApp(var a:Int) {

  //从构造器必须先实现主构造器
  def this( a:Int, b:String){
    this(a)
  }


}
