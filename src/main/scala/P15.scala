package s99

object P15 {
  def answer() = {
    val howManyDuplicate = 3
    val list = List('a, 'b, 'c, 'c, 'd)
    def recursive(num: Int, ls: List[Symbol]): List[Symbol] = ls flatMap { e => List.fill(num)(e) }

    println(recursive(howManyDuplicate, list))
  }
}
