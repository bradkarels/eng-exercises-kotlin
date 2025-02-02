package io.rev27.cracking.ch1

object IsUnique {
    fun isUnique(s: String): Boolean {
        val ca = s.toCharArray()
//        return doUnique(ca)
        return doUnique2(ca)
    }

    tailrec fun doUnique(ca: CharArray, isUnique: Boolean = false): Boolean {
        return if (ca.isEmpty()) isUnique
        else {
            val first = ca[0]
            val rest = ca.sliceArray(1 until ca.size)
            var unique = true
            loop@ for (i in rest) {
                if (i == first) {
                    unique = false
                    break@loop
                }
            }
            if (unique) doUnique(rest, unique)
            else doUnique(charArrayOf(), unique)
        }
    }

    private tailrec fun doUnique2(ca: CharArray, isUnique: Boolean = false): Boolean {
        return if (ca.isEmpty()) isUnique
        else {
            val first = ca[0]
            val rest = ca.sliceArray(1 until ca.size)
            if (hasDuplicate(rest, first)) doUnique2(charArrayOf(), false)
            else doUnique2(rest, true)
        }
    }

    private tailrec fun hasDuplicate(ca: CharArray, i: Char): Boolean {
        return if (ca.isEmpty()) false
        else {
            if (ca[0] == i) true
            else hasDuplicate(ca.sliceArray(1 until ca.size), i)
        }

    }
}