package io.rev27.cracking.ch1

/*
1.4 Problem:
Given a string, write a function to determine if it is a permutation of a palindrome.
Need not be dictionary words.
 */
object PalindromePermutation {
    fun isPalindromePermutation(s: String): Boolean {
        val sansSpaces = s.filterNot { it.isWhitespace() }.lowercase().toCharArray()
        return doPalindromePermutation(sansSpaces.sortedArray())
    }

    // Pairs and orphans...
    fun doPalindromePermutation(ca: CharArray, nbrOrphans: Int = 0): Boolean {
        return if (nbrOrphans > 1) {
            false
        } else if (ca.size == 1) {
            if (nbrOrphans == 1) false
            else true
        } else if (ca.isEmpty()) {
            true
        } else {
            if (ca[0] == ca[1]) doPalindromePermutation(ca.drop(2).toCharArray(), nbrOrphans)
            else doPalindromePermutation(ca.drop(1).toCharArray(), nbrOrphans + 1)
        }
    }
}
