/**
  * SmallerNumbersThanCurrent
  *
  * @author takono
  */
object SmallerNumbersThanCurrent {
  def smallerNumbersThanCurrent(nums: Array[Int]): Array[Int] = {
    nums.map(p => nums.count(q => q < p))
  }
}
