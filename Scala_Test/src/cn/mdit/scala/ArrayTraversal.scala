package cn.mdit.scala

object ArrayTraversal {
  def main(args: Array[String]): Unit = {
    var myArr=Array(1.9,2.9,3.4,3.5)
    //打印输出所有的数组元素
    for (x<-myArr){
      print(x+" ")
    }
    //打印换行
    println()
    //计算数组所有元素的总和
    var total=0.0
    for (i <- 0 to (myArr.length-1)){
      total +=myArr(i)
    }
    println("总和为"+total)
    //查找数组中的最大元素
    var max =myArr(0)
    for (i<-1 to (myArr.length-1)){
      if (myArr(i)> max){
        max=myArr(i)
      }
    }
    println("最大值为 "+max);
  }

}
