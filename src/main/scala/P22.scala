package s99

object P22 {
  def answer() = {
    val start = 4
    val end = 9
    def range(s: Int, e: Int, ls: List[Int] = Nil): List[Int] = (s, e, ls) match {
      case (s, e, _) if s >= e => throw new NoSuchElementException
      case (_, _, Nil) => range(s, e, List(s))
      case (_, _, _ :+ last) if last == e => ls
      case _ => range(s, e, (ls :+ (ls.last + 1)))
    }


    println(range(start, end))
  }
}
