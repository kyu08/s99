package s99
object P02 {
  def answer: Int = {
    val list = List(1,2,3,4,5)
    def recursive(list: List[Int]): Int = list match {
      // length が 1 だったら例外を投げる
//       case h :: Nil => throw new Error("length is 1")
      // length が 2 になるまで先頭を削除
      case a :: b :: _ => recursive(list.tail)
      // length が 2 になったら先頭を返す
      case c :: d => c
      case _ => throw new Error("input is Nil")
    }

    recursive(list)
  }
}
