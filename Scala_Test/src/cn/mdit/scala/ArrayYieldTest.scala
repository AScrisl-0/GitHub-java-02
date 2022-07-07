package cn.mdit.scala

object ArrayYieldTest {
  def main(args: Array[String]): Unit = {
    //定义一个数组
    val arr=Array(1,2,3,4,5,6,7,8,9)
    //将偶数取出乘以10后生成一个新的数组
    val newArr=for (e<- arr if e%2==0) yield e*10
    println(newArr.toBuffer)
  }

}
