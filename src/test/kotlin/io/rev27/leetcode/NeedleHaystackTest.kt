package io.rev27.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NeedleHaystackTest {
    @Test
    fun sadTest() {
        val haystack = "sadbutsad"
        val needle = "sad"
        val expected = 0
        val actual = NeedelHaystack.findNeedleIdx(needle, haystack)
        assertEquals(expected, actual)
    }

    @Test
    fun leetTest() {
        val haystack = "leetcode"
        val needle = "leeto"
        val expected = -1
        val actual = NeedelHaystack.findNeedleIdx(needle, haystack)
        assertEquals(expected, actual)
    }

    @Test
    fun leet2Test() {
        val haystack = "${"leetcode".repeat(5)}floofabcdefg"
        val needle = "floof"
        val expected = 40
        val actual = NeedelHaystack.findNeedleIdx(needle, haystack)
        assertEquals(expected, actual)
    }

    @Test
    fun leet3Test() {
        val haystack = "${"leetcode".repeat(500)}floof${"abcdefg".repeat(500)}"
        val needle = "floof"
        val expected = 4000
        val actual = NeedelHaystack.findNeedleIdx(needle, haystack)
        assertEquals(expected, actual)
    }

    @Test
    fun panamaTest() {
        val haystack = "${"abcdefg".repeat(500)}gfedcba${"abcdefg".repeat(500)}"
        val needle = "amanaplanacanalpanama"
        val expected = -1
        val actual = NeedelHaystack.findNeedleIdx(needle, haystack)
        assertEquals(expected, actual)
    }
}
