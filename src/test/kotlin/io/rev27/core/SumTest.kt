package io.rev27.core

import io.rev27.core.Sum.customSum
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.test.assertContains

class SumTest {

    @Test
    fun sum0() {
        val given = intArrayOf(0,1,2,3,4,5,6,7,8,9)
        val expected = 45
        val actual = Sum.sum(given)
        assertEquals(expected, actual)
    }

    @Test
    fun sumExt0() {
        val given = intArrayOf(0,1,2,3,4,5,6,7,8,9)
        val expected = 45
        val actual = given.customSum()
        assertEquals(expected, actual)
    }

    @Test
    fun sumExt1() {
        val given = intArrayOf(0,1,2,3,4,5,6,7,8,9)
        val expected = 45
        val actual = given.customSum()
        assertEquals(expected, actual)
    }
}
