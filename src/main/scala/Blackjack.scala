import scala.util.Random
import Deck._
import Blackjack._

case class Deck(cards: Seq[Int] = defaultDeck) {

  def giveCards(i: Int) = (cards.take(i), this.copy(cards = cards.drop(i)))

}

object Deck {
  def defaultDeck = Random.shuffle(
    for {
      suit <- 1 to 4
      card <- 1 to 13
    } yield card)
}

case class Blackjack(deck: Deck = Deck()) {

  val (samCards, resultDeckAfterSam) = deck.giveCards(2)
  val (dealerCards, resultDeckAfterDealer) = resultDeckAfterSam.giveCards(2)

  def isSamWinner = handScore(samCards) == 21
  def isDealerWinner = handScore(dealerCards) == 21

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