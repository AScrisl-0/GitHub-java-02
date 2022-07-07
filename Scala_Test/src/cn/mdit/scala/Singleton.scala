package cn.mdit.scala
//单例对象
object SingletonObject {
  def hello(): Unit ={
    println("Hello,This is Singleton Object")
  }
}
object Singleton{
  def main(args: Array[String]): Unit = {
    SingletonObject.hello()
  }
}
