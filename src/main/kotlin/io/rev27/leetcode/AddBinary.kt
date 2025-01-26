package io.rev27.leetcode

data class Digit(val a: String, val b: String, val r: String)

object AddBinary {
    fun String.isOne(): Boolean {
        return this.equals("1")
    }
    fun String.isZero(): Boolean {
        return this.equals("0")
    }

    fun addBinary(a: String, b: String): String = doAddBinary(a,b)

    fun mkNext(s: String): String =
        if (s.isEmpty() || s.last() == '0') "0"
        else "1"

    private tailrec fun doAddBinary(a: String, b: String, sum: String = "", r: String = ""): String {
        if ((a.isEmpty() && b.isEmpty()) && r.isEmpty()) return sum
        else {
            val nextA = mkNext(a)
            val nextB = mkNext(b)
            val nextR = mkNext(r)
            val d = Digit(nextA, nextB, nextR)
            return when {
                d.a.isZero() && d.b.isZero() && d.r.isZero() -> doAddBinary(a.dropLast(1), b.dropLast(1), "0$sum")
                d.a.isZero() && d.b.isZero() && d.r.isOne() -> doAddBinary(a.dropLast(1), b.dropLast(1), "1$sum")
                d.a.isOne() && d.b.isZero() && d.r.isZero() -> doAddBinary(a.dropLast(1), b.dropLast(1), "1$sum")
                d.a.isZero() && d.b.isOne() && d.r.isZero() -> doAddBinary(a.dropLast(1), b.dropLast(1), "1$sum")
                d.a.isZero() && d.b.isOne() && d.r.isOne() -> doAddBinary(a.dropLast(1), b.dropLast(1), "0$sum", "1'")
                d.a.isOne() && d.b.isZero() && d.r.isOne() -> doAddBinary(a.dropLast(1), b.dropLast(1), "0$sum", "1'")
                d.a.isOne() && d.b.isOne() && d.r.isZero() -> doAddBinary(a.dropLast(1), b.dropLast(1), "0$sum", "1'")
                else -> doAddBinary(a.dropLast(1), b.dropLast(1), "1$sum", "1'") // 1,1,1
            }
        }
    }
}