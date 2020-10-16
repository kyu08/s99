package s99

object P11 {
  def answer() = {
    val lst = P09.answer()
    val result = lst map {
      e => e match {
        case h :: Nil => h
        case o => (o.length, o(0))
      }
    }
    println(result)
  }
}
