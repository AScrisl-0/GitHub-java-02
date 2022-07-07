package cn.mdit.scala

object PatternMatch {
  def main(args: Array[String]): Unit = {
    println(matchTest(3))
  }
  //模式匹配
  def matchTest(x: Int) :String =x match{
    case 1=>"one"
    case 2=>"two"
    case _=>"many"
  }

}
