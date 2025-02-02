package io.rev27.leetcode

object ValidParens {
    const val openP = '('
    const val closedP = ')'
    const val openB = '['
    const val closedB = ']'
    const val openCB = '{'
    const val closedCB = '}'

    fun isValid(word: String): Boolean {
        return if (word.length % 2 != 0) false
        else {
            doIsValid(word)
        }
    }

    fun isPair(i: Char, j: Char): Boolean {
        return when (i) {
            openP -> j == closedP
            openCB -> j == closedCB
            openB -> j == closedB
            else -> false
        }
    }

    fun dropPairAtIdx(s: String, idx: Int): String {
        if (idx >= s.length - 1 || idx < 0) throw IllegalArgumentException("Index must be between 0 and ${s.length - 2}.")
        return s.take(idx) + s.drop(idx + 2)
    }

    fun doIsValid(word: String, idx: Int = 0): Boolean {
        return if (word.isEmpty()) true
        else if (word.length == 2) isPair(word[0], word[1])
        else {
            val i = word[idx]
            val j = word[idx + 1]
            if (isPair(i,j)) {
                val newWord = dropPairAtIdx(word, idx)
                doIsValid(newWord, idx)
            } else {
                if (word.length == idx + 2) doIsValid(word)
                else doIsValid(word, idx + 1)
            }
        }
    }
}
