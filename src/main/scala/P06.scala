package s99

object P06 {
  def answer(): Boolean = {
    val list1 = List(1, 2, 3, 2, 1)
    // これだと 偶数個のときが考慮できてない。
    def recursive(list: List[Int]): Boolean = list match {
      case Nil => throw new NoSuchElementException
      // 要素数が1つなら true
      case h :: Nil => true
      // 先頭と末尾が等しければ再帰
      // 等しくなければ false
      // case (h :: other) :+ h => { って書きたいけどそれはむりそう
      case (h :: other) :+ t if (h == t) =>
        if(h == t) return recursive(other)
        false
      case _ => false
    }

    // model answer めっちゃシンプル...
    // def isHoge[A](ls: List[A]): Boolean = ls == ls.reverse

    recursive(list1)
  }
}
