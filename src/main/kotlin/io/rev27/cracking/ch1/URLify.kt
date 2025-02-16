package io.rev27.cracking.ch1

data class StringIndexes(val left: Int, val right: Int)

/*
1.3 Problem:
Write a method to replace all the spaces in a string with "%20".
Assume the string has sufficient space at the end to hold the additional characters.
If possible, do in place using an array.
 */
object URLify {
    fun urlify(s: String): String {
        val ca = s.dropWhile { it.isWhitespace() }.toCharArray()
        do {
            val idxes = findNextString(ca)
            val rIdx = idxes.second
            val lIdx = idxes.first
            mvString(ca, rIdx, lIdx)
            injectUrlSpace(ca)
        } while (nextFreeSpaceFromRight(ca) > -1)
        return String(ca)
    }

    private fun nextFreeSpaceFromRight(ca: CharArray): Int {
        for (n in ca.lastIndex downTo 0) {
            if (ca[n].isWhitespace()) return n
        }
        return -1
    }

    private fun findNextString(ca: CharArray): Pair<Int, Int> {
        val start = nextFreeSpaceFromRight(ca)
        var rightIdx = -1
        var leftIdx = -1
        xxx@ for (idx in start  downTo 0) {
            if (rightIdx == -1 && !ca[idx].isWhitespace()) {
                rightIdx = idx
                continue@xxx
            }
//            if (rightIdx > -1 && leftIdx == -1 && ca[idx].isWhitespace()) {
            if (rightIdx > -1 && ca[idx].isWhitespace()) {
                leftIdx = idx + 1
                break@xxx
            }
        }
        return Pair(leftIdx, rightIdx)
    }

    private fun mvString(ca: CharArray, rightIdx:Int, leftIdx: Int) {
        var insertionPoint = nextFreeSpaceFromRight(ca)
        if (insertionPoint > 0)  {
            for (idx in rightIdx downTo leftIdx) {
                val tmp = ca[insertionPoint]
                ca[insertionPoint] = ca[idx]
                ca[idx] = tmp
                insertionPoint -= 1
            }
        }
    }

    private fun injectUrlSpace(ca: CharArray) {
        val insertionPoint = nextFreeSpaceFromRight(ca)
        ca[insertionPoint] = '0'
        ca[insertionPoint - 1] = '2'
        ca[insertionPoint - 2] = '%'
    }
}
