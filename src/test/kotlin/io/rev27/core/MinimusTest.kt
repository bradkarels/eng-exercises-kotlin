package io.rev27.core

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MinimusTest {

    @Test
    fun minOfList0() {
        val listOfInts0 = listOf(33,55,7,-3,12,42,666,100,2,4,100000,8)

        val expected = -3
        val actual = Minimus.min(listOfInts0)
        assertEquals(expected, actual)
    }

    @Test
    fun minOfList1() {
        val listOfInts1 = (1000 downTo 42).toList()

        val expected = 42
        val actual = Minimus.min(listOfInts1)
        assertEquals(expected, actual)
    }
}
