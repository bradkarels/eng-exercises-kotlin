package io.rev27.cracking.ch1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PalindromePermutationTest {

    @Test
    fun isPalindromePermutation() {
        val given = "xxoxx"
        val expected = true
        val actual = PalindromePermutation.isPalindromePermutation(given)
        assertEquals(expected, actual)
    }

    @Test
    fun isPalindromePermutation0() {
        val given = "Tact Coa" // Taco Cat
        val expected = true
        val actual = PalindromePermutation.isPalindromePermutation(given)
        assertEquals(expected, actual)
    }

    @Test
    fun isPalindromePermutation1() {
        val given = "xxoxxx"
        val expected = false
        val actual = PalindromePermutation.isPalindromePermutation(given)
        assertEquals(expected, actual)
    }

    @Test
    fun isPalindromePermutation2() {
        val given = "aaaaaaaaaaaaaaaaaaaaaaxxxaaaaaaaaaaaaaaaaaaaaaa"
        val expected = true
        val actual = PalindromePermutation.isPalindromePermutation(given)
        assertEquals(expected, actual)
    }

    @Test
    fun isPalindromePermutation3() {
        val given = "kkkkkkkkkkkkkkkkkkkkkkxxkkkkkkkkkkkkkkkkkkkkkk"
        val expected = true
        val actual = PalindromePermutation.isPalindromePermutation(given)
        assertEquals(expected, actual)
    }

    @Test
    fun isPalindromePermutation4() {
        val given = "A man a plan a canal panama"
        val expected = true
        val actual = PalindromePermutation.isPalindromePermutation(given)
        assertEquals(expected, actual)
    }

    @Test
    fun isPalindromePermutation5() {
        val given = "a man a plan a canal panama"
        val expected = true
        val actual = PalindromePermutation.isPalindromePermutation(given)
        assertEquals(expected, actual)
    }

    @Test
    fun isPalindromePermutation6() {
        val given = "a man a plan a canal panama!"
        val expected = false
        val actual = PalindromePermutation.isPalindromePermutation(given)
        assertEquals(expected, actual)
    }

    @Test
    fun isPalindromePermutation7() {
        val given = "" // "technically" it is the same backwards and forwards...
        val expected = true
        val actual = PalindromePermutation.isPalindromePermutation(given)
        assertEquals(expected, actual)
    }

    @Test
    fun isPalindromePermutation8() {
        val given = "abcdefg"
        val expected = false
        val actual = PalindromePermutation.isPalindromePermutation(given)
        assertEquals(expected, actual)
    }

    @Test
    fun isPalindromePermutation9() {
        val given = "aa"
        val expected = true
        val actual = PalindromePermutation.isPalindromePermutation(given)
        assertEquals(expected, actual)
    }
}