package s99

object P10 {
  def answer() = {
    val lst = P09.answer()
    lst map { l => (l.length, l(0)) }
  }
}
