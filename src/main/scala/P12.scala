package s99

object P12 {
  def answer() = {
    val lst = P10.answer()
    def recursive(list: List[(Int, Symbol)]): List[Symbol] = list match {
      case Nil => Nil
      case (length, sym) :: tail if length != 0 => sym :: recursive((length - 1, sym) :: tail)
      case _ :: tail => recursive(tail)
    }

    println(recursive(lst))
  }
}
