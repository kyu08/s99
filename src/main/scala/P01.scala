package s99
object P01 {
  def answer: Int = {
    val list = List(1,1,2,3,5,8)

    // most simple
    list.last

    // or
    def recursive(list: List[Int]): Int = list match {
      case h :: Nil => h

      // これは _.tail してる？ そのあと tail で使えるのか...🤔
      // しかし tail -> hoge にしても動くってことは .tail してないのか！
      case _ :: hoge => recursive(hoge)
      case _ => throw new NoSuchElementException
    }
    recursive(list)
  }
}
