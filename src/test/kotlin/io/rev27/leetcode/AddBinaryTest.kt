package io.rev27.leetcode

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class AddBinaryTest {

    @Test
    fun is100() {
        val a = "11"
        val b = "1"
        val expected = "100"
        val actual = AddBinary.addBinary(a, b)
        assertEquals(expected, actual)
    }

    @Test
    fun is10101() {
        val a = "1010"
        val b = "1011"
        val expected = "10101"
        val actual = AddBinary.addBinary(a, b)
        assertEquals(expected, actual)
    }

    @Test
    fun is1110() {
        val a = "111"
        val b = "111"
        val expected = "1110"
        val actual = AddBinary.addBinary(a, b)
        assertEquals(expected, actual)
    }

    @Test
    fun is1010() {
        val a = "111"
        val b = "11"
        val expected = "1010"
        val actual = AddBinary.addBinary(a, b)
        assertEquals(expected, actual)
    }

    @Test
    fun is10() {
        val a = "1"
        val b = "1"
        val expected = "10"
        val actual = AddBinary.addBinary(a, b)
        assertEquals(expected, actual)
    }

    @Test
    fun is101010110() {
        val a = "101010101"
        val b = "1"
        val expected = "101010110"
        val actual = AddBinary.addBinary(a, b)
        assertEquals(expected, actual)
    }
}