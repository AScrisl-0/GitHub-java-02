package cn.mdit.scala

object SetTest {
  def main(args: Array[String]): Unit = {
    val site =Set ("Itcast","Google","Baidu")
    val nums :Set[Int]=Set()
    println("第一个网站是："+site.head)
    println("最后一个网站是："+site.tail)
    println("查看集合site是否为空："+site.isEmpty)
    println("查看nums是否为空："+nums.isEmpty)
    println("查看site的前两个网站："+site.take(2))
    println("查看集合site是否包含网站Itcast: "+site.contains("Itcast"))
  }

}
