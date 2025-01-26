package io.rev27.leetcode

object TwoSum {
    fun twoSum(nbrs: Array<Int>,  tgt: Int): Array<Int> {
        val nbrsWithIdx: List<Pair<Int, Int>> = nbrs.zip(nbrs.indices)
        for (p in nbrsWithIdx) {
            val a = p.first
            val b = p.second
            println("$a::$b")
        }
        return twoSumRec(nbrsWithIdx, tgt)
        // Non-recursive solution - probably more efficient.
//        for (i in 0 .. nbrs.size-2) {
//            val iVal = nbrs[i]
//            for (j in i + 1 .. nbrs.size-1) {
//                if (iVal + nbrs[j] == tgt) return arrayOf(i,j)
//            }
//        }
//        return arrayOf(-1)
    }

    tailrec fun twoSumRec(nbrs: List<Pair<Int,Int>>, tgt: Int): Array<Int> {
        return if (nbrs.size == 2) {
            val idx0 = nbrs.first().second
            val idx1 = nbrs.drop(1).first().second
            arrayOf(idx0,idx1)
        } else {
            val head = nbrs.first()
            val tail = nbrs.drop(1)
            val valid = tail.filter { it.first + head.first == tgt }
            return if (valid.isEmpty()) twoSumRec(tail, tgt)
            else arrayOf(head.second, valid.first().second)
        }
    }
}
