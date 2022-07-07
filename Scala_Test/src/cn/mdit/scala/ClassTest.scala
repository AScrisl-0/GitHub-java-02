package cn.mdit.scala

class Point(xc:Int,yc:Int){
  var x:Int=xc
  var y:Int=yc
  def move(dx:Int,dy:Int): Unit ={
    x=x+dx
    y=y+dy
    println("x的坐标点："+x)
    println("y的坐标点："+y)
  }
}

object ClassTest {
  def main(args: Array[String]): Unit = {
    val pt=new Point(10,20)
    pt.move(10,10)
  }

}
