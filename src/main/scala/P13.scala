package s99

object P13 {
  def answer() = {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    def recursive(list: List[Symbol]): List[(Int, Symbol)] = list match {
      case Nil => Nil
      case lst => {
        val (same, other) = lst.span(e => e == lst.head)
        (same.length, same.head) :: recursive(other)
      }
    }
    println(recursive(list))
  }
}
