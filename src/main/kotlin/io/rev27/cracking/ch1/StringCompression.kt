package io.rev27.cracking.ch1

/*
1.6 Problem:
String Compression: Implement simple compression using counts of repeated chars. Return original string if compressed
version becomes longer than the original. Assume [a-zA-Z].
 */
object StringCompression {
    fun compress(s: String): String {
        return doCompress(s.toCharArray(), s, s.length)
//        return compress2(s)
    }

    tailrec fun doCompress(ca: CharArray, orig: String, origLen: Int, result: CharArray = charArrayOf()): String {
        return if (result.size >= origLen) orig
        else if (ca.isEmpty()) String(result)
        else {
            val first = ca[0]
            val nbrOfChars = ca.takeWhile { it == first }.size
            val valu = "$nbrOfChars$first".toCharArray()
            doCompress(ca.drop(nbrOfChars).toCharArray(), orig, origLen, result.plus(valu))
        }
    }

    // w/loop vs. recursion
    fun compress2(s: String): String {
        if (s.isEmpty()) return s
        var result = ""
        var current =  s[0]
        var cnt = 1
        abc@ for (i in 1 until s.length) {
            if (s[i] == current) {
                cnt += 1
                continue@abc
            } else {
                result = result + cnt + current
                current = s[i]
                cnt = 1
            }
        }
        result = result + cnt + current
        // Not ideal - could bake in checks for result len in loop, or set count to 0/-1 and break...
        return if (result.length >= s.length) s
        else result
    }
}
