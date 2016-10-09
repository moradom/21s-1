object Blackjack {

  def handScore(cs: Seq[Int]): Int = {
    def cardScore(c: Int): Int = {
      if (c == 1)
        11
      else if (c >= 10)
        10
      else
        c
    }

    if (cs.isEmpty)
      0
    else
      cardScore(cs.head) + handScore(cs.tail)
  }
}
