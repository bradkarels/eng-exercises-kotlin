package io.rev27.leetcode
//// Determine whether an integer is a palindrome.
//// An integer is a palindrome when it reads the same backward as forward.
//object Palindrome {
//  def isPalindrome(x: Int): Boolean = {
//    if (x < 0) false
//    else rip(x.toString.toCharArray.map(_.asDigit))
//  }

object Palindrome {
    fun isPalidrome(i: Int): Boolean =
        if (i < 0) false
        else doIsPalendrome(toArray(i).toList())

    tailrec fun doIsPalendrome(i: List<Int>): Boolean =
        if (i.isEmpty() || i.size == 1) true
        else if (i.size == 2) i[0] == i[1]
        else if (i.first() == i[i.size - 1]) doIsPalendrome(i.drop(1).dropLast(1))
        else false

    tailrec fun toArray(i: Int, res: Array<Int> = emptyArray()): Array<Int> =
        if (i < 0) arrayOf()
        else if (i < 10) arrayOf(i) + res
        else toArray(i / 10, arrayOf(i % 10) + res)

}