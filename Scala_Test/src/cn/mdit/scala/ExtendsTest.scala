package cn.mdit.scala

class Points(val xc:Int,val yc:Int){
  var x:Int=xc
  var y:Int=yc
  def move(dx:Int,dy:Int): Unit ={
    x=x+dx
    y=y+dy
    println("x的坐标点："+x)
    println("y的坐标点："+y)
  }
}
class Location(override val xc:Int,override val yc:Int,val zc:Int) extends Points(xc,yc){
  var z:Int=zc
  def move(dx:Int,dy:Int,dz:Int): Unit =
  {
    x=x+dx
    y=y+dy
    z=z+dz
    println("x的坐标点："+x)
    println("y的坐标点："+y)
    println("z的坐标点："+z)
  }
}
object ExtendsTest {
  def main(args: Array[String]): Unit = {
    val loc=new Location(10,20,15)
    loc.move(10,10,5)
  }
}
