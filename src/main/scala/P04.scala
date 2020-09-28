package s99

object P04 {
  def answer(): Int = {
    val list = List(1,3,4,4)

    // simplest answer
//    list.length

    // recursive
    var length = 1
    def recursive(list: List[Int]): Int = {
      list match {
        case h :: Nil => length
        case _ :: tail => {
          length += 1
          recursive(tail)
        }
        case Nil => {
          println(123)
          throw new NoSuchElementException
        }
      }
    }
    recursive(list)
  }
}
