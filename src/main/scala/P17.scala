package s99

object P17 {
  def answer() = {
    val len = 3
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    def recursive(num: Int, ls: List[Symbol]): (List[Symbol], List[Symbol]) = ls match {
      case h :+ tail if h.length == num => (h, List(tail))
      case h :+ tail => (recursive(num, h)._1, recursive(num, h)._2 :+ tail)
    }
    println(recursive(len, list))
    assert(recursive(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == (List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
    println(list.splitAt(3))
  }
}
