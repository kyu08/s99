package s99
object P01 {
  def answer: Int = {
    val list = List(1,1,2,3,5,8)
    
    // model answer
    list.last

    // or
    def recursive(list: List[Int]): Int = list match {
      case h :: Nil => h

      // それ以降で使わない場合は'_'?
      case _ :: hoge => recursive(hoge)
      case _ => throw new NoSuchElementException
    }
    recursive(list)
  }
}
