package io.rev27.cracking.ch1

import kotlin.math.abs


/*
1.5 Problem:
There are three types of edits that can be performed on a string: insert a char, remove  a char, and replace a char.
Given two strings write a function to determine if they are one or fewer edits away.
 */
object OffByOne {
    fun offByOne(s0: String, s1: String): Boolean {
        println("offby")
        val s0len by lazy { s0.length }
        val s1len by lazy { s1.length }
        val sLenSum by lazy { s0len + s1len }
        println(s0len)
        println(s1len)
        println(sLenSum)
        println("$sLenSum / 2 > $s1len")
        println("$sLenSum / 2 < ${(s1len - 1)}")
        if (s0.isEmpty() && s1.isEmpty()) return false
        else if (abs(s0len - s1len) > 1) return false
        else {
            if (s0len == s1len) {
                var offBy = 0
                for (idx in s0.indices) {
                    if (s0[idx] != s1[idx]) {
                        offBy += 1
                        if (offBy > 1) break
                    }
                }
                return offBy <= 1
            } else {
                val (big, sml) = if (s0len > s1len) Pair(s0,s1) else Pair(s1,s0)
                return if (big.length == 1) true
                else offByOne2(big, sml)
            }
        }
    }

    tailrec fun offByOne2(s0: String, s1: String, i0: Int = 0, i1: Int = 0, offBy: Int = 0): Boolean {
        return if (offBy > 1) false
        else if (i0 > s1.lastIndex) true
        else {
            if (s0[i0] == s1[i1]) offByOne2(s0, s1, i0 + 1, i1 + 1, offBy)
            else offByOne2(s0, s1, i0 + 1, i1, offBy + 1)
        }
    }
}
