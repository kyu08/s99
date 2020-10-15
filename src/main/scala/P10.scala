package s99

object P10 {
  def answer() = {
    val lst = P09.answer()
    val result = lst map { l => (l.length, l(0)) }

    println(result)
  }
}
