import org.scalatest.{Matchers, WordSpec}


class TetrisSpec extends WordSpec with Matchers {


  "Tetris" should {

    "all'inzio la boad 3x3 deve essere vuota" in {

      val board = new Board()

      board.toString shouldBe
        "___\n" +
          "___\n" +
          "___\n"

    }

    "have a first block in top middle" in {

      val board = new Board()

      board.tick()

      board.toString shouldBe
        "_X_\n" +
          "___\n" +
          "___\n"


    }


  }

}

class Board() {

  private var content =
    "___\n" +
      "___\n" +
      "___\n"


  def tick() = {

    content = "_X_\n" +
      "___\n" +
      "___\n"


  }


  override def toString = content


}