/**
 * scalalearning sample program
 */
package amkt922.sample

/**
 * @author dev
 *
 */
object Main {
  def main(args: Array[String]): Unit = {
    println("hello scalalearning world.")
    val m = new Main
    println(m.isOdd(2))
    println(m.isEven(2))
    println(m.isLeapYear(1981))
  }
}

class Main {
  def isOdd(a: Int): Boolean = if (a % 2 == 1) true else false
  def isEven(a: Int): Boolean = {
    !isOdd(a)
  }
  def isLeapYear(year: Int): Boolean = {
    if (year % 100 == 0) {
      if (year % 400 == 0) {
        true
      } else {
        false
      }
    } else if (year % 4 == 0) {
      true
    } else {
      false
    }
  }
}