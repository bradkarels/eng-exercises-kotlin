package io.rev27.core

object Binary {
    fun search(nbrs: List<Int>, tgt: Int): Int {
        return doSearch(nbrs, tgt)
    }

    fun doSearch(nbrs: List<Int>, tgt: Int): Int {
        if (nbrs.isEmpty()) return -1
        else if (nbrs.size == 1 && nbrs[0] != tgt) {
            return doSearch(emptyList(), tgt)
        } else {
            val mid = nbrs.size / 2
            val guess = nbrs[mid]
            if (guess == tgt) {
                return 1
            } else if (guess > tgt) {
                return doSearch(nbrs.subList(0, mid), tgt)
            } else {
                return doSearch(nbrs.subList(mid + 1, nbrs.size), tgt)
            }
        }
    }
}
