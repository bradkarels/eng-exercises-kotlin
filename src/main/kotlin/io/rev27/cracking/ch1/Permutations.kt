package io.rev27.cracking.ch1

object Permutations {
    fun isPermutation(s0: String, s1: String): Boolean {
        val ca0 = s0.lowercase().filterNot { it.isWhitespace() }.toCharArray()
        val ca1 = s1.lowercase().filterNot { it.isWhitespace() }.toCharArray()
        return if (ca0.size != ca1.size)  false
        else doPermutationG2(ca0, ca1)
    }

    tailrec fun doPermutationG2(ca0: CharArray, ca1: CharArray, isPermutation: Boolean = false): Boolean {
        println(ca0)
        println(ca1)
        return if (ca0.isEmpty()) isPermutation
        else {
            val head = ca0[0]
            val idx = ca1.indexOf(head)
            if (idx == -1) {
                doPermutationG2(charArrayOf(), charArrayOf(), false)
            } else {
                val newCa0 = ca0.drop(1).toCharArray()
                val newCa1 = dropAtIndex(ca1, idx)
                doPermutationG2(newCa0, newCa1, true)
            }
        }
    }

    private fun dropAtIndex(ca: CharArray, idx: Int): CharArray {
        return try {
//            val front: CharArray = ca.take(idx).toCharArray()
//            val back: CharArray = ca.drop(idx + 1).toCharArray()
//            front.plus(back)
            val lFront = ca.take(idx)
            val lBack = ca.drop(idx + 1)
            (lFront + lBack).toCharArray()
        } catch (e: Exception) {
            println(e.message)
            throw e
        }
    }

    fun doPermutationG1(s0: String, s1: String): Boolean {
        val ss0 = s0.toCharArray().sortedArray()
        val ss1 = s1.toCharArray().sortedArray()
        val matches: List<Boolean> = ss0.zip(ss1) { a, b -> a == b }
        return matches.size == ss0.size
    }

    fun doPermutationG0(s0: String, s1: String): Boolean {
        val ss0 = s0.toCharArray().sortedArray()
        val ss1 = s1.toCharArray().sortedArray()
        var isPermutation = true
        for (i in ss0.indices) {
            if (ss0[i] != ss1[i]) {
                isPermutation = false
                break
            }
        }
        return isPermutation
    }

    fun doPermutation(ca0: CharArray, ca1: CharArray, result: Boolean = false): Boolean {
        return if (ca0.isEmpty())  true
        else {
            val head = ca0[0]
            for (idx in ca1.indices) {
                if (head == ca1[idx]) {
                    val newCa0 = ca0.drop(1).toCharArray()// TODO: tail func
                    val newCa1 = dropAtIndex(ca1, idx)
                    doPermutation(newCa0, newCa1, true)
                } else doPermutation(charArrayOf(), charArrayOf(), false)
            }
            return false
        }
    }
}
