import org.scalatest.funsuite.AnyFunSuite

/**
  * SmallerNumbersThanCurrentTest
  *
  * @author takono
  */
class SmallerNumbersThanCurrentTest extends AnyFunSuite {
  val testData: Seq[(Array[Int], Array[Int])] =
    Seq(
      (Array(8, 1, 2, 2, 3), Array(4, 0, 1, 1, 3)),
      (Array(6, 5, 4, 8), Array(2, 1, 0, 3)),
      (Array(7, 7, 7, 7), Array(0, 0, 0, 0))
    )

  testsFor {
    testData.foreach { p =>
      test(s"give: ${p._1}: obtain: ${p._2}") {
        assert(
          SmallerNumbersThanCurrent
            .smallerNumbersThanCurrent(p._1)
            .seq == p._2.seq
        )
      }
    }
  }
}
