package ch.frankel.mutationtesting

import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test

import org.testng.Assert.assertFalse
import org.testng.Assert.assertTrue

class LowPassPredicateTest {

    lateinit private var predicate: LowPassPredicate

    @BeforeMethod
    protected fun setUp() {
        predicate = LowPassPredicate(LIMIT)
    }

    @Test
    fun should_return_true_when_under_limit() {
        val result = predicate.filter(LIMIT - 1)
        assertTrue(result)
    }

    @Test
    fun should_return_false_when_under_limit() {
        val result = predicate.filter(LIMIT + 1)
        assertFalse(result)
    }

    companion object {
        private val LIMIT = 5
    }
}
