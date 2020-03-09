import org.scalatest.funsuite.AnyFunSuite

/**
  * DefangingAnIPAddressTest
  *
  * @author takono
  */
class DefangingAnIPAddressTest extends AnyFunSuite {
  val testData: Seq[(String, String)] =
    Seq(("1.1.1.1", "1[.]1[.]1[.]1"), ("255.100.50.0", "255[.]100[.]50[.]0"))

  testsFor {
    testData.foreach { p =>
      test(s"give: ${p._1}: obtain: ${p._2}") {
        assert(DefangingAnIPAddress.defangIPaddr(p._1) == p._2)
      }
    }
  }
}
