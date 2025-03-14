package io.rev27.cracking.ch1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class IsRotationTest {

    @Test
    fun isRotation() {
        val s1 = "abcdef"
        val s2 = "bcdefa"
        val expected = true
        val result = IsRotation.isRotation(s1, s2)
        assertEquals(expected, result)
    }

    @Test
    fun isRotation2() {
        val s1 = "abcdef"
        val s2 = "fedcba"
        val expected = false
        val result = IsRotation.isRotation(s1, s2)
        assertEquals(expected, result)
    }

    @Test
    fun isRotation3() {
        val s1 = "aaaaaaa"
        val s2 = "aaaaaaa"
        val expected = true
        val result = IsRotation.isRotation(s1, s2)
        assertEquals(expected, result)
    }

    @Test
    fun isRotation4() {
        val s1 = "aaaaaaa"
        val s2 = "aaaxaaa"
        val expected = false
        val result = IsRotation.isRotation(s1, s2)
        assertEquals(expected, result)
    }

    @Test
    fun isRotation5() {
        val s1 = "aaaaaaa"
        val s2 = "aaaaaa"
        val expected = false
        val result = IsRotation.isRotation(s1, s2)
        assertEquals(expected, result)
    }

    @Test
    fun isRotation6() {
        val s1 = "A taco Cat"
        val s2 = "TacoCata   "
        val expected = true // assuming we ignore whitespace and case
        val result = IsRotation.isRotation(s1, s2)
        assertEquals(expected, result)
    }
}