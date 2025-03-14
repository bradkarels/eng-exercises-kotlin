package io.rev27.core

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SelectionSortTest {

    @Test
    fun selectionSort0() {
        val listOfInts0 = listOf(33,55,7,-3,12,42,666,100,2,4,100000,8)
        val expected = listOf(-3, 2, 4, 7, 8, 12, 33, 42, 55, 100, 666, 100000)
        val actual = SelectionSort.selectionSort(listOfInts0)
        assertEquals(expected, actual)
    }

    @Test
    fun minOfList1() {
        val listOfInts1 = (1000 downTo 42).toList()

        val expected = (42..1000).toList()
        val actual = SelectionSort.selectionSort(listOfInts1)
        assertEquals(expected, actual)
    }
}