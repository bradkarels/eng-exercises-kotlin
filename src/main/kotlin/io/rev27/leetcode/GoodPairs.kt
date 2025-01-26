package io.rev27.leetcode

object GoodPairs {
    fun nbrIdenticalPairs(nbrs: Array<Int>): Int {
        var pairs = 0
        if (nbrs.size <= 1) return pairs
        for (iidx in 0..< nbrs.size-1) {
            for (jidx in iidx + 1 .. nbrs.size-1) {
                val i = nbrs[iidx]
                val j = nbrs[jidx]
                if (i == j) pairs++
            }
        }
        return pairs
    }
}