package cn.mdit.scala

class Dog{
  val id=666
  private var name="二哈"
  def printName():Unit={
    //在Dog类中可以访问伴生对象Dog的私有字段
    println(Dog.CONSTANT+name)
  }
}
object Dog {
  private var CONSTANT="汪汪汪..."
  def main(args: Array[String]): Unit = {
    val dog=new Dog
    dog.name="二哈 666"
    dog.printName()
  }

}
