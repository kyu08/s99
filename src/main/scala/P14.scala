package s99

object P14 {
  def answer() = {
    val list = List('a, 'b, 'c, 'c, 'd)
    def recursive(list: List[Symbol]): List[Symbol] = list match {
      case Nil => Nil
      case h :: tail => h :: h :: recursive(tail)
    }

    println(recursive(list))
  }
}
