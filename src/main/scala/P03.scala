package s99
object P03 {
  def answer(): Int = {
    // my answer
    val num = 1
    val list = List(1,2,3)
//    def hoge(index: Int, list: List[Int]): Int = list(index)
//    hoge(num, list)

    // model answer
    def modelanswer(index: Int, list: List[Int]): Int = {
      if(index >= 0) list(index)
      else throw new NoSuchElementException
    }
    modelanswer(num, list)
  }
}
