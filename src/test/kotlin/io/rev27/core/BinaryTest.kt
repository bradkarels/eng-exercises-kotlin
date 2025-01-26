package io.rev27.core

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class BinaryTest {

    @Test
    fun searchOkayMin() {
        val nbrs = listOf(1,2,3,4,5,6,7,8,9,10)
        val tgt = 1
        val expected = 1
        val actual = Binary.doSearch(nbrs, tgt)
        assertEquals(expected, actual)
    }

    @Test
    fun searchOkMax() {
        val nbrs = listOf(1,2,3,4,5,6,7,8,9,10)
        val tgt = 10
        val expected = 1
        val actual = Binary.doSearch(nbrs, tgt)
        assertEquals(expected, actual)
    }

    @Test
    fun searchOkLow() {
        val nbrs = listOf(1,2,3,4,5,6,7,8,9,10)
        val tgt = 3
        val expected = 1
        val actual = Binary.doSearch(nbrs, tgt)
        assertEquals(expected, actual)
    }

    @Test
    fun searchOkHigh() {
        val nbrs = listOf(1,2,3,4,5,6,7,8,9,10)
        val tgt = 8
        val expected = 1
        val actual = Binary.doSearch(nbrs, tgt)
        assertEquals(expected, actual)
    }

    @Test
    fun searchKO() {
        val nbrs = listOf(1,2,3,4,5,6,7,8,9,10)
        val tgt = 666
        val expected = -1
        val actual = Binary.doSearch(nbrs, tgt)
        assertEquals(expected, actual)
    }

}