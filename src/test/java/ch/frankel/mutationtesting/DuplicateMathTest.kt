package ch.frankel.mutationtesting

import org.testng.annotations.Test

import org.testng.Assert.assertEquals

class DuplicateMathTest {

    @Test
    fun should_return_sum_of_parameters() {
        val math = DuplicateMath()
        val sum = math.add(1, 1)
    }
}
