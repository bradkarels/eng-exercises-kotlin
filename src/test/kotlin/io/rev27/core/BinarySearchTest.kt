package io.rev27.core

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class BinarySearchTest {

    val nbrs = intArrayOf(1,3,5,6,9,12,14,16,22,23,42,666,999,1000)

    @Test
    fun searchFor666() {
        val expected = 666
        val result = BinarySearch.search(nbrs, 666)
        assertEquals(expected, result)
    }

    @Test
    fun searchFor3() {
        val expected = 3
        val result = BinarySearch.search(nbrs, 3)
        assertEquals(expected, result)
    }

    @Test
    fun searchFor14() {
        val expected = 14
        val result = BinarySearch.search(nbrs, 14)
        assertEquals(expected, result)
    }

    @Test
    fun searchFor13() {
        val expected = null
        val result = BinarySearch.search(nbrs, 13)
        assertEquals(expected, result)
    }

    @Test
    fun searchFor1000() {
        val expected = 1000
        val result = BinarySearch.search(nbrs, 1000)
        assertEquals(expected, result)
    }
}