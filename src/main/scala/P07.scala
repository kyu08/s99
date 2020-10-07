package s99

object P07 {
  val listA = List(List(1, 1), 2, List(3, List(5, 8)))
  def answer(): Unit ={
    def recursive(ls: List[Any]): List[Any] = ls flatMap {
      case ms: List[_] => recursive(ms)
      case e => List(e)
    }

    println(recursive(listA))
  }
}
