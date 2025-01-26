package io.rev27.leetcode

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class PalindromeTest {

    @Test
    fun isPalidromeTest0() {
        val nbr = 1001
        assertTrue(Palindrome.isPalidrome(nbr))
    }

    fun isPalidromeTest1() {
        val nbr = 10901
        assertTrue(Palindrome.isPalidrome(nbr))
    }

    @Test
    fun isPalidromeTest2() {
        val nbr = -1001
        assertFalse(Palindrome.isPalidrome(nbr))
    }

    @Test
    fun isPalidromeTest3() {
        val nbr = 4234
        assertFalse(Palindrome.isPalidrome(nbr))
    }

    @Test
    fun isPalidromeTest4() {
        val nbr = 542345
        assertFalse(Palindrome.isPalidrome(nbr))
    }
}
