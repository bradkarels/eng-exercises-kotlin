package io.rev27.cracking.ch1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class IsUniqueTest {

    @Test
    fun isUnique0() {
        val given = "aba"
        val expected = false
        val actual = IsUnique.isUnique(given)
        assertEquals(expected, actual)
    }

    @Test
    fun isUnique1() {
        val given = "abcdefghijklmnop"
        val expected = true
        val actual = IsUnique.isUnique(given)
        assertEquals(expected, actual)
    }

    @Test
    fun isUnique2() {
        val given = "abcdefghijklmnopqrstuvwxyz0123456789a"
        val expected = false
        val actual = IsUnique.isUnique(given)
        assertEquals(expected, actual)
    }

    @Test
    fun isUnique3() {
        val given = "abcdefghijklmnopqrstuvwxyz0123456789"
        val expected = true
        val actual = IsUnique.isUnique(given)
        assertEquals(expected, actual)
    }

    @Test
    fun isUnique4() {
        val given = "999999999999999999999999"
        val expected = false
        val actual = IsUnique.isUnique(given)
        assertEquals(expected, actual)
    }
}