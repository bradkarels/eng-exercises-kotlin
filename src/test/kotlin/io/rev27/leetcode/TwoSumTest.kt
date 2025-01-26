package io.rev27.leetcode

import io.rev27.leetcode.TwoSum.twoSum
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TwoSumTest {

    @Test
    fun twoSumKlassik() {
        val nbrs = arrayOf(1,2,3,4,5,7,1000,7,9,10,12,11,15,2345,4,16,1,1,1,1,1,11,1,1,1,1,1,1,1,1,1,1)
        val target = 3345
        val expected = arrayOf(6,13)
        val actual = twoSum(nbrs, target)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun twoSumKlassic() {
        val nbrs = arrayOf(2,7,11,15)
        val target = 9
        val expected = arrayOf(0,1)
        val actual = twoSum(nbrs, target)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun twoSumGotcha() {
        val nbrs = arrayOf(3,3)
        val target = 6
        val expected = arrayOf(0,1)
        val actual = twoSum(nbrs, target)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun twoSumGotchaWithLastTwo() {
        val nbrs = arrayOf(3,2,4)
        val target = 6
        val expected = arrayOf(1,2)
        val actual = twoSum(nbrs, target)
        assertArrayEquals(expected, actual)
    }
}