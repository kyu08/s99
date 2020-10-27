package s99

object P21 {
  def answer() = {
    val newSymbol = 'new
    val index = 1
    val list = List('a, 'b, 'c, 'd)
    def hoge(sym: Symbol, i: Int, ls: List[Symbol]): List[Symbol] = {
      val (a, b) = ls.splitAt(i)
      (a :+ sym) ::: b
    }

//    def modelAnswer(sym: Symbol, i: Int, ls: List[Symbol]): List[Symbol] = ls.splitAt(i) match {
//      case (pre, post) => (pre :+ sym) ::: post
//    }

    println(hoge(newSymbol, index, list))
  }
}
