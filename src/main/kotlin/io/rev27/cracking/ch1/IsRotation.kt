package io.rev27.cracking.ch1

object IsRotation {

    // Given two strings, determine if one string is a rotation of the other. Try to use only a single call to
    // `isRotation`. (e.g. "waterbottle" is a rotation of "erbottlewat")
    fun isRotation(s0: String, s1: String): Boolean {
        val ca0 = s0.trim().filterNot { it.isWhitespace() }.lowercase().toCharArray()
        var ca1 = s1.trim().filterNot { it.isWhitespace() }.lowercase().toCharArray()
        if (ca0.size != ca1.size) return false
        for (i in ca0.size downTo 1) {
            if (matches(ca0, ca1))
                return true
            else {
                ca1 = rot1(ca1)
            }
        }
        return false
    }

    // Could rotate by some number...say, if we advanced to a matching char n chars over then rotn or similar...
    fun rot1(ca0: CharArray): CharArray {
        val first: Char = ca0[0]
        val rest: CharArray = ca0.sliceArray(1 until ca0.size)
        return rest.plus(first)
    }

    fun matches(ca0: CharArray, ca1: CharArray): Boolean {
        for (i in ca0.indices) {
            if (ca0[i] != ca1[i]) return false
        }
        return true
    }
}