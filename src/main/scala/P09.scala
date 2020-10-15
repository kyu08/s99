package s99

object P09 {
  def answer(): List[List[Symbol]] ={
    val ls = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    def recursive(ls: List[Symbol]): List[List[Symbol]] = ls match {
      case h :: tail => (h :: tail.takeWhile(_ == h)) :: recursive(tail.dropWhile(_ == h))
      case Nil => Nil
    }

    def pack[A](ls: List[A]): List[List[A]] = {
      if(ls.isEmpty) List(List())
      else {
        val (packed, next) = ls span { _ == ls.head }
        if(next == Nil) List(packed)
        else packed :: pack(next)
      }
    }

    pack(ls)
  }
}
