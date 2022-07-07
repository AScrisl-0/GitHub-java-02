package cn.mdit.scala

object MapTest {
  def main(args: Array[String]): Unit = {
    val colors=Map("red"->"#FF0000","azure"->"#F0FFFF","peru"->"#CD853F")
    val peruColors=if(colors.contains("peru")) colors("peru") else 0
    val azureColors=colors.getOrElse("azure",0)
    println("获取colors中键为red的值："+colors("red"))
    println("获取colors中所有的键："+colors.keys)
    println("获取colors中所有的值："+colors.values)
    println("检测colors是否为空："+ colors.isEmpty)
    println("判断colors是否包含键peru,包含则返回对应值，否则返回0:"+peruColors)
    println("判断colors是否包含键azure,包含则返回对应值，否则返回0:"+azureColors)
  }
}
