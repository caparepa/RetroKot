package pw.kasendev.retrokot

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.Test

import org.junit.Assert.*

class CalculatorTest : Spek({

    val x = 10
    val y = 2
    val calculator = Calculator()

    given("Given x= $x and y= $y") {

        on("Addition") {
            val sum = calculator.sum(x, y)
            it("Should return the x + y = 12") {
                assertEquals(12, sum)

            }
        }

        on("Subtraction") {
            val subs = calculator.subtract(x, y)
            it("Should return x - y = 8") {
                assertEquals(8, subs)
            }
        }

        on("Multiplying") {
            val mult = calculator.multiple(x, y)
            it("Should return x * y = 20") {
                assertEquals(20, mult)
            }
        }

        on("Dividing") {
            val divide = calculator.divide(x, y)

            it("Should return x / y = 5") {
                assertEquals(5, divide)
            }
        }
    }

})