package tddbc9th

import org.junit.jupiter.api.Assertions
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object ExactNumberFieldSpec : Spek({
    describe("単一の数値") {
        it("数値を保持する") {
            val sut = ExactNumberField(value = 42, lowerLimit = 0)
            Assertions.assertEquals(42, sut.value)
        }
        it("下限値を保持する") {
            val sut = ExactNumberField(value = 42, lowerLimit = 0)
            Assertions.assertEquals(0, sut.lowerLimit)
        }
    }
})