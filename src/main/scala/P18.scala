package s99

object P18 {
  def answer() = {
    val i = 3
    val k = 7
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    def hoge(i: Int, k: Int, ls: List[Symbol]): List[Symbol] = ls.drop(i).take(k - i)

    println(hoge(i, k, list))
    assert(hoge(i, k, list) == List('d, 'e, 'f, 'g))
    assert(hoge(5, 10, list) == List('f, 'g, 'h, 'i, 'j))
  }
}
