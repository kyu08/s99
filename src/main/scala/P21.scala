package s99

object P21 {
  def answer() = {
    println(123123)
    val newSymbol = 'new
    val index = 1
    val list = List('a, 'b, 'c, 'd)
    def hoge(sym: Symbol, i: Int, ls: List[Symbol]): List[Symbol] = {
      val (a, b) = ls.splitAt(i)
      (a :+ sym) ::: b
    }

    println(hoge(newSymbol, index, list))
  }
}
