package io.rev27.leetcode

import io.rev27.leetcode.GoodPairs.nbrIdenticalPairs
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

/*
Given an array of integers nums.
A pair (i,j) is called good if nums[i] == nums[j] and i < j.
Return the number of good pairs.

Example 1:
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

Example 2:
Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.

Example 3:
Input: nums = [1,2,3]
Output: 0

Constraints:
1 <= nums.length <= 100
1 <= nums[i] <= 100
Accepted
 */
class GoodPairsTest {
    @Test
    fun nbrIdenticalPairsTest01() {
        val nbrs = arrayOf(1,2,3,1,1,3)
        val expected = 4
        val actual = nbrIdenticalPairs(nbrs)
        assertEquals(expected, actual)
    }

    @Test
    fun nbrIdenticalPairsTest02() {
        val nbrs = arrayOf(1,1,1,1)
        val expected = 6
        val actual = nbrIdenticalPairs(nbrs)
        assertEquals(expected, actual)
    }

    @Test
    fun nbrIdenticalPairsTest03() {
        val nbrs = arrayOf(1,2,3)
        val expected = 0
        val actual = nbrIdenticalPairs(nbrs)
        assertEquals(expected, actual)
    }

    @Test
    fun nbrIdenticalPairsTest04() {
        val nbrs = arrayOf<Int>()
        val expected = 0
        val actual = nbrIdenticalPairs(nbrs)
        assertEquals(expected, actual)
    }
}