import org.scalatest.{Matchers, WordSpec}


class TetrisSpec extends WordSpec with Matchers {


  "Tetris" should {

    "all'inzio la boad 3x3 deve essere vuota" in {

      val board = new Board()

      board.toString shouldBe
        "___" +
        "___" +
        "___"

    }


  }

}

class Board() {

  override def toString =
    "___" +
    "___" +
    "___"


}