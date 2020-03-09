/**
  * DefangingAnIPAddress
  *
  * @author takono
  */
object DefangingAnIPAddress {
  def defangIPaddr(address: String): String = {
    address.replace(".", "[.]")
  }
}
