package io.rev27.leetcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class LengthOfLastWordTest {
    @Test
    fun lengthOfShort() {
        val words = "foo"
        val expected = 3
        val actual = LengthOfLastWord.lengthOfLastWord(words)
        assertEquals(expected, actual)
    }

    @Test
    fun lengthOfLastWordWithNumbers() {
        val words = "this word is from a h4x0r"

    }

    @Test
    fun lengthOfPalindrome() {
        val words = "a man a plan a canal panama"
        val expected = 6
        val actual = LengthOfLastWord.lengthOfLastWord(words)
        assertEquals(expected, actual)
    }

    @Test
    fun lengthOfPalindromeWithTrailingSpaces() {
        val words = "a man a plan a canal panama      "
        val expected = 6
        val actual = LengthOfLastWord.lengthOfLastWord(words)
        assertEquals(expected, actual)
    }

    @Test
    fun lengthOfSuperLong() {
        val superlong = "abcdef ".repeat(1000) + "floof"
        val expected = 5
        val actual = LengthOfLastWord.lengthOfLastWord(superlong)
        assertEquals(expected, actual)
    }

    @Test
    fun lengthOfSuperLongWithTrailingSpaces() {
        val superLongWithTrailingSpace = "abcdef ".repeat(1000) + "floof     "
        val expected = 5
        val actual = LengthOfLastWord.lengthOfLastWord(superLongWithTrailingSpace)
        assertEquals(expected, actual)
    }
}