package io.rev27.leetcode

import io.rev27.leetcode.PlusOneArray.doPlusOne

object PlusOneArray {
    fun plusOne(digits: Array<Int>): Array<Int> {
        // "carry the one" on first execution to get the +1
        return doPlusOne(digits.toList(), true)
    }

    tailrec fun doPlusOne(digits: List<Int>, carryTheOne: Boolean = false, result: List<Int> = listOf()): Array<Int> {
        return if (digits.isEmpty()) {
            if (!carryTheOne) result.toTypedArray()
            else (listOf(1) + result).toTypedArray()
        } else {
            val last = digits.last()
            if (last == 9) doPlusOne(digits.dropLast(1), true, listOf(0) + result)
            else if (carryTheOne) doPlusOne(digits.dropLast(1), false, listOf(last + 1) + result)
            else doPlusOne(emptyList(), false, digits + result)
        }
    }
}
