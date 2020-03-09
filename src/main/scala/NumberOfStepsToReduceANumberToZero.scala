/**
  * 1342. Number of Steps to Reduce a Number to Zero
  *
  * https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
  *
  * @author takono
  */
object NumberOfStepsToReduceANumberToZero {
  def numberOfSteps(num: Int): Int = {
    recursive(num, 0)
  }

  def recursive(x: Int, ct: Int = 0): Int = {
    x match {
      case 0                 => ct
      case 1                 => ct + 1
      case _ if (x % 2 == 0) => recursive(x / 2, ct + 1)
      case _                 => recursive(x - 1, ct + 1)
    }
  }
}
