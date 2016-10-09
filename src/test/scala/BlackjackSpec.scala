import Blackjack._

class BlackjackSpec extends BaseSpec {

  "calculate a hand score" should {
    "get 22 points for 2 aces" in {
      handScore(Seq(1, 1)) shouldBe 22
    }
  }
}

