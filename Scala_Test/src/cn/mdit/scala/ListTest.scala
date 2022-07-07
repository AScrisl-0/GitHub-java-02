package cn.mdit.scala

object ListTest {
  def main(args: Array[String]): Unit = {
    val fruit = "apples"::("oranges"::("pears":: Nil))
    val nums=Nil
    println("Head of fruit: "+fruit.head)
    println("Tail of fruit: "+fruit.tail)
    println("Check if fruit is Empty: "+fruit.isEmpty)
    println("Check if nums is Empty: "+nums.isEmpty)
    println("Tail of fruit :"+fruit.take(2))
    println("Contains of fruit: "+fruit.contains("apples"))
  }

}
