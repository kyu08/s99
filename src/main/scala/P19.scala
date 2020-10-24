package s99

object P19 {
  def answer() = {
    def cut(num: Int, ls: List[Symbol]): List[Symbol] = {
      ls.drop(num) ++ ls.take(num)
    }

    val num = -2
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)

    println(cut(num, list))
  }
}
