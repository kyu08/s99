package s99

object P06 {
  def answer(): Boolean = {
    val list1 = List(1, 2, 3, 2, 1)
    val list2 = List(1, 2, 3, 2, 2)
    val list3 = List(1)
    def recursive(list: List[Int]): Boolean = list match {
      case Nil => throw new NoSuchElementException
      case h :: Nil => true
//      case (h :: other) :+ h => { って書きたいけどそれはむりそう
      case (h :: other) :+ t =>
        if(h == t) return recursive(other)
        false
      case _ => false
    }

    println(recursive(list1))
    println(recursive(list2))
    recursive(list3)
  }
}
