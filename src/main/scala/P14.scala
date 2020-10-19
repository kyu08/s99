package s99

object P14 {
  def answer() = {
    val list = List('a, 'b, 'c, 'c, 'd)
//    def recursive(ls: List[Symbol]): List[Symbol] = ls match {
//      case Nil => Nil
//      case h :: tail => h :: h :: recursive(tail)
//    }

    def modelAnswer(ls: List[Symbol]): List[Any] = ls flatMap { e => List(e,e) }

//    println(recursive(list))
    println(modelAnswer(list))
  }
}
