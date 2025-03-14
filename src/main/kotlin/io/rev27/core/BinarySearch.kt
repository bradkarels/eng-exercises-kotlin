package io.rev27.core

object BinarySearch {
    fun search(nbrs: IntArray, target: Int): Int? {
        return doSearch(nbrs, target)
    }

    private tailrec fun doSearch(nbrs: IntArray, target: Int, result: Int? = null): Int? {
        val len = nbrs.size
        return if (len == 0) result
        else {
            val idx = len/2
            val guess: Int = nbrs[idx]
            when {
                guess == target -> doSearch(intArrayOf(), target, guess)
                guess > target -> doSearch(nbrs.sliceArray(0 until idx), target)
                else -> doSearch(nbrs.sliceArray(idx + 1 until len), target)
            }
        }
    }
}
