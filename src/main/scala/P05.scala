package s99
object P05 {
  def answer(): List[Int] = {
    val list = List(1,2,3,4,5)

    // simplest answer
//    list.reverse

    // recursive
    // パターンマッチのスコープに複数のListがあるときはどう指定すれば...?
    // (listの要素数をみたい...)
    def recursive(list: List[Int], listTarget: List[Int] = Nil): List[Int] = list match {
      case Nil => if(listTarget.length != 0) listTarget else list
      case head :+ tail => {
        recursive(head, listTarget :+ tail)
      }
      case _ => throw new NoSuchElementException
    }

    recursive(list)
  }

}
