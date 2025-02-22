package io.rev27.cracking.ch1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class StRingStringCompressionionTest {

    @Test
    fun compress0() {
        val given =    "abbcccc"
        val expected = "1a2b4c"
        val result = StringCompression.compress(given)
        assertEquals(expected, result)
    }

    @Test
    fun compress1() {
        val given = "abc"
        val expected = "abc"
        val result = StringCompression.compress(given)
        assertEquals(expected, result)
    }

    @Test
    fun compress2() {
        val given = "x".repeat(1000)
        val expected = "1000x"
        val result = StringCompression.compress(given)
        assertEquals(expected, result)
    }

    @Test
    fun compress3() {
        val given = "aabbcc"
        val expected = "aabbcc"
        val result = StringCompression.compress(given)
        assertEquals(expected, result)
    }

    @Test
    fun compress4() {
        val given = "aaabbcc"
        val expected = "3a2b2c"
        val result = StringCompression.compress(given)
        assertEquals(expected, result)
    }

    @Test
    fun compress5() {
        val given = ""
        val expected = ""
        val result = StringCompression.compress(given)
        assertEquals(expected, result)
    }
    @Test
    fun compress6() {
        val given = ""
        val expected = ""
        val result = StringCompression.compress(given)
        assertEquals(expected, result)
    }

    @Test
    fun compress7() {
        val given = "x".repeat(1000)
        val expected = "1000x"
        val result = StringCompression.compress(given)
        assertEquals(expected, result)
    }
}
