package io.rev27.leetcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PlusOneArrayTest {

    @Test
    fun plusOne0() {
        val provided = arrayOf(1,2,3)
        val expected = arrayOf(1,2,4)
        val actual = PlusOneArray.plusOne(provided)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun plusOne1() {
        val provided = arrayOf(4,3,2,1)
        val expected = arrayOf(4,3,2,2)
        val actual = PlusOneArray.plusOne(provided)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun plusOne2() {
        val provided = arrayOf(9)
        val expected = arrayOf(1,0)
        val actual = PlusOneArray.plusOne(provided)
        assertArrayEquals(actual, expected)
    }

    @Test
    fun plusOne3() {
        val provided = arrayOf(9,9,9,9,9)
        val expected = arrayOf(1,0,0,0,0,0)
        val actual = PlusOneArray.plusOne(provided)
        assertArrayEquals(actual, expected)
    }

    @Test
    fun plusOne4() {
        val provided = arrayOf(4,3,2,0)
        val expected = arrayOf(4,3,2,1)
        val actual = PlusOneArray.plusOne(provided)
        assertArrayEquals(expected, actual)
    }
}