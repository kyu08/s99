package s99

object P09 {
  def answer(): Unit ={
    val ls = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    def recursive(ls: List[Symbol]): List[List[Symbol]] = ls match {
      case h :: tail => (h :: tail.takeWhile(_ == h)) :: recursive(tail.dropWhile(_ == h))
      case Nil => Nil
    }

    println(recursive(ls))
  }
}
