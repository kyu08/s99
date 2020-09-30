package s99
object P05 {
  def answer(): List[Int] = {
    val list = List(1,2,3,4,5)

    // simplest answer
//    list.reverse

    // recursive
    def recursive(list: List[Int]): List[Int] = list match {
      case Nil => Nil
      case head :: tail => {
        recursive(tail) ::: List(head)
      }
      case _ => throw new NoSuchElementException
    }

    recursive(list)
  }

}
