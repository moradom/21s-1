import scala.util.Random

case class Deck(cards: Seq[Int] = Random.shuffle(
                for {
                  suit <- 1 to 4
                  card <- 1 to 13
                } yield card)) {

  def giveCards(i: Int) = (cards.take(i), this.copy(cards = cards.drop(i)))

}

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
