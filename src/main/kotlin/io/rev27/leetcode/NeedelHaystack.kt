package io.rev27.leetcode

object NeedelHaystack {
    fun findNeedleIdx(needle: String, haystack: String): Int {
        return doFindNeedleIdx(haystack, needle)
    }

    tailrec fun doFindNeedleIdx(haystack: String, needle: String, idx: Int = 0): Int {
        return if (haystack.length < needle.length) {
            -1
        } else {
            if (haystack.first() == needle.first()) {
                val possibleNeedle = haystack.take(needle.length)
                if (possibleNeedle == needle) {
                    return idx
                }
            }
            doFindNeedleIdx(haystack.drop(1), needle, idx + 1)
        }
    }
}
