package s99

object P18 {
  def answer() = {
    val i = 3
    val k = 7
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    def buildIn(i: Int, k: Int, ls: List[Symbol]): List[Symbol] = ls.slice(i, k)

    println(buildIn(i, k, list))
    assert(buildIn(i, k, list) == List('d, 'e, 'f, 'g))
    assert(buildIn(5, 10, list) == List('f, 'g, 'h, 'i, 'j))
  }
}
