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
}

