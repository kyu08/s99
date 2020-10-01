package s99

object P07 {
  // Not と Or はコピペ (http://halcat.org/scala/curryhoward/index.html)
  type Not[A] = A => Nothing
  type Or[A, B] = Not[Not[A] with Not[B]]
  type nestedList = Or[Int, List[Or[Int, List[Int]]]]

  val listA = List(List(1, 1), 2, List(3, List(5, 8)))
  def answer(list: List[nestedList]): List[Int] = list match {
    case h :: rest => {
      // Int だったら 再帰 + 結合
      if (h: Int) {
        h :: answer(rest)
        // List だったら 再帰 + List結合
      } else if(h: Or(List[nestedList],List[Int])) {
        list ::: answer(rest)
      }
    }
    // Nil になったらおわり？
    case Nil => Nil
    case _ => throw new NoSuchElementException
  }
  answer(listA)
}
