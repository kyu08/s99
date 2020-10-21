package s99

object P16 {
  def answer() = {
    val dropNum = 3
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    def dropElement(num: Int, ls: List[Symbol]): List[Symbol] = ls match {
      case head if head.length == dropNum => head.init
      case head :+ tail => dropElement(num, head) :+ tail
      case _ if num > ls.length => throw new NoSuchElementException
    }
    println(dropElement(dropNum, list))
    assert(dropElement(3, list) == List('a, 'b, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  }
}
