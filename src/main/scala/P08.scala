package s99

object P08 {
  def answer(): Unit ={
    // 2つずつ比較するのを末尾までやりたい
    val ls = List(Symbol("a"), Symbol("a"), Symbol("a"), Symbol("a"), Symbol("b"), Symbol("c"), Symbol("c"), Symbol("a"), Symbol("a"), Symbol("d"), Symbol("e"), Symbol("e"), Symbol("e"), Symbol("e"))
    def recursive(ls: List[Symbol]): List[Symbol] = ls match {
      case a :: b :: c if a == b => recursive(b :: c)
      case a :: b => a :: recursive(b)
      case Nil => Nil

      // ほぼ model answer なんだけど 1~2つめの case のかわりに dropWhile を使って以下のように書くともう少しすっきりかける。
      // case h :: tail => h :: recursive(tail.dropWhile(_ == h))
    }
    println(recursive(ls))
  }
}
