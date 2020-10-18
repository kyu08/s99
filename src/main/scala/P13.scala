package s99

object P13 {
  def answer() = {
    println(123)
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    def recursive(list: List[Symbol]): List[(Int, Symbol)] = list match {
      case Nil => Nil
      case h :: tail => {
        val (a, b) = (h :: tail).span(e => e == h)
        (a.length, a.head) :: recursive(b)
      }
    }
    println(recursive(list))
  }
}
