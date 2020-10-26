package s99

object P20 {
  def answer() = {
    val num = 1
    val list = List('a, 'b, 'c, 'd)
    def hoge(i: Int, ls: List[Symbol]): (List[Symbol], Symbol) = {
      val headLs = ls.take(i + 1)
      val tail = ls.drop(i + 1)
      (headLs.init ++ tail , headLs.last)
    }
    println(hoge(num, list))
  }
}
