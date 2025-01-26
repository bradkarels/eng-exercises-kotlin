package io.rev27.leetcode

object LengthOfLastWord {
    fun lengthOfLastWord(word: String): Int {
        val x = word.dropLastWhile { it.isWhitespace() }
        val y = x.takeLastWhile { it.isLetter() }
        return y.length
    }
}
