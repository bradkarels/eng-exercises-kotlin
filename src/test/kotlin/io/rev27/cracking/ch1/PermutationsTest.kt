package io.rev27.cracking.ch1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PermutationsTest {

    @Test
    fun isPermutation() {
        val word0 = "cat"
        val word1 = "atc"
        val expected = true
        val actual = Permutations.isPermutation(word0, word1)
        assertEquals(expected, actual)
    }

    @Test
    fun isPermutation0() {
        val word0 = "aaaaaaaaaaaaaaaaaaaaaaaa"
//        val word1 = ""
        val expected = true
        val actual = Permutations.isPermutation(word0, word0)
        assertEquals(expected, actual)
    }

    @Test
    fun isPermutation1() {
        val word0 = "Wu Tang Clan"
        val word1 = "gant wU Lanc"
        val expected = true
        val actual = Permutations.isPermutation(word0, word1)
        assertEquals(expected, actual)
    }

    @Test
    fun isPermutation2() {
        val word0 = "aaaaaa"
        val word1 = "bbbbbb"
        val expected = false
        val actual = Permutations.isPermutation(word0, word1)
        assertEquals(expected, actual)
    }

    @Test
    fun isPermutation3() {
        val word0 = "aaaaaa"
        val word1 = "bbbbbbx"
        val expected = false
        val actual = Permutations.isPermutation(word0, word1)
        assertEquals(expected, actual)
    }

    @Test
    fun isPermutation4() {
        val word0 = "aaxaac"
        val word1 = "caaxaa"
        val expected = true
        val actual = Permutations.isPermutation(word0, word1)
        assertEquals(expected, actual)
    }

    @Test
    fun isPermutation5() {
        val word0 = "gfedcba"
        val word1 = "abcdefg"
        val expected = true
        val actual = Permutations.isPermutation(word0, word1)
        assertEquals(expected, actual)
    }

    @Test
    fun isPermutation6() {
        val word0 = "                 Wu Tang Clan"
        val word1 = "gant wU Lanc  "
        val expected = true
        val actual = Permutations.isPermutation(word0, word1)
        assertEquals(expected, actual)
    }

    @Test
    fun isPermutation7() {
        val word0 = "     Wu Tang Clan"
        val word1 = "gant      wULanc  "
        val expected = true
        val actual = Permutations.isPermutation(word0, word1)
        assertEquals(expected, actual)
    }
}