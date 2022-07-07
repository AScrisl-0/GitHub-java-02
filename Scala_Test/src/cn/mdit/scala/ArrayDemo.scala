package cn.mdit.scala
import scala.collection.mutable.ArrayBuffer

object ArrayDemo {
  def main(args: Array[String]): Unit = {
    //初始化一个长度为8的定长数组，其所有元素均为0
    val arr1=new Array[Int](8)
    //直接打印定长数组，内容为数组的hashcode值
    println(arr1)
    val test=ArrayBuffer[Int]()
    //+=尾部追加元素
    test+=1
    println(test)
    //追加多个元素
    test+=(2,3,4,5)
    println(test)
    //追加一个数组++=
    test ++=Array(6,7)
    println(test)
    //追加一个数组缓冲
    test++=ArrayBuffer(8,9)
    println(test)
    //数组插入元素，下表插入法
    test.insert(0,-1,0)
    println(test)
    //删除数组元素，下标删除法
    test.remove(0)
    println(test)
  }
}
