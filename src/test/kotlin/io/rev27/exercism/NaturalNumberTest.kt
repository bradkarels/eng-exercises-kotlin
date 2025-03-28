package io.rev27.exercism

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class NaturalNumberTest {

    @Test
    fun smallPerfectNumberIsClassifiedCorrectly() {
        assertEquals(Classification.PERFECT, classify(6))
    }

    @Test
    fun mediumPerfectNumberIsClassifiedCorrectly() {
        assertEquals(Classification.PERFECT, classify(28))
    }

    @Test
    fun largePerfectNumberIsClassifiedCorrectly() {
        assertEquals(Classification.PERFECT, classify(33550336))
    }

    @Test
    fun smallAbundantNumberIsClassifiedCorrectly() {
        assertEquals(Classification.ABUNDANT, classify(12))
    }

    @Test
    fun mediumAbundantNumberIsClassifiedCorrectly() {
        assertEquals(Classification.ABUNDANT, classify(30))
    }

    @Test
    fun largeAbundantNumberIsClassifiedCorrectly() {
        assertEquals(Classification.ABUNDANT, classify(33550335))
    }

    @Test
    fun smallestPrimeDeficientNumberIsClassifiedCorrectly() {
        assertEquals(Classification.DEFICIENT, classify(2))
    }

    @Test
    fun smallestNonPrimeDeficientNumberIsClassifiedCorrectly() {
        assertEquals(Classification.DEFICIENT, classify(4))
    }

    @Test
    fun mediumNumberIsClassifiedCorrectly() {
        assertEquals(Classification.DEFICIENT, classify(32))
    }

    @Test
    fun largeDeficientNumberIsClassifiedCorrectly() {
        assertEquals(Classification.DEFICIENT, classify(33550337))
    }

    @Test
    fun edgeCaseWithNoFactorsOtherThanItselfIsClassifiedCorrectly() {
        assertEquals(Classification.DEFICIENT, classify(1))
    }

    @Test
    fun zeroIsNotANaturalNumber() {
        assertFailsWith<RuntimeException> {
            classify(0)
        }
    }

    @Test
    fun negativeNumberIsNotANaturalNumber() {
        assertFailsWith<RuntimeException> {
            classify(-1)
        }
    }
}
