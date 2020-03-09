import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.funsuite.AnyFunSuite

/**
  * 1342. Number of Steps to Reduce a Number to Zero
  *
  * https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
  *
  * @author takono
  */
class NumberOfStepsToReduceANumberToZeroTest extends AnyFunSuite {

  val testData: Seq[(Int, Int)] =
    Seq((1, 1), (2, 2), (8, 4), (13, 6), (14, 6), (123, 12))

  testsFor {
    testData.foreach { p =>
      test(s"give: ${p._1}: obtain: ${p._2}") {
        assert(NumberOfStepsToReduceANumberToZero.numberOfSteps(p._1) == p._2)
      }
    }
  }
}
