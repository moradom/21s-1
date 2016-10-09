import Blackjack._

class BlackjackSpec extends BaseSpec {

  "calculate a hand score" should {
    "get 22 points for 2 aces" in {
      handScore(Seq(1, 1)) shouldBe 22
    }

    "get 4 points for 2 dukes" in {
      handScore(Seq(2, 2)) shouldBe 4
    }

    "get 20 points for 2 queens" in {
      handScore(Seq(12, 12)) shouldBe 20
    }
  }

  "deck" should {
    "return 2 cards from the deck together with the new deck" in {
      val deck = Deck()

      val (resultCards, resultDeck) = deck.giveCards(2)

      resultCards shouldBe deck.cards.take(2)
      resultDeck.cards shouldBe deck.cards.drop(2)
    }
  }

}

