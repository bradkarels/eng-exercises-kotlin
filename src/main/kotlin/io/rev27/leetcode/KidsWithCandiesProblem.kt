package io.rev27.leetcode

object KidsWithCandiesProblem {
    fun kidsWithCandies(candies: Array<Int>, extraCandies: Int): Array<Boolean> {
        return recKidsWithCandies(candies.toList(), extraCandies, candies.max())
    }

    private tailrec fun recKidsWithCandies(candies: List<Int>, extraCandies: Int, max: Int = 0, result: List<Boolean> = listOf<Boolean>()): Array<Boolean> {
        if (candies.isEmpty()) return result.toTypedArray()
        else {
            val head = candies.first()
            val canHaveMost = head + extraCandies >= max
            return recKidsWithCandies(candies.takeLast(candies.size - 1), extraCandies, max, result + canHaveMost)
        }
    }
}
