package io.rev27.leetcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ValidParensTest {

    @Test
    fun isValid0() {
        val given = "(){}[]"
        val expected = true
        val actual = ValidParens.isValid(given)
        assertEquals(expected, actual)
    }

    @Test
    fun isValid1() {
        val given = "([])({{}(([()[]{}])[])})"
        val expected = true
        val actual = ValidParens.isValid(given)
        assertEquals(expected, actual)
    }

    @Test
    fun isValid2() {
        val given = "([])({{}(([()[]{}])[])})((((((((({{{{{{"
        val expected = false
        val actual = ValidParens.isValid(given)
        assertEquals(expected, actual)
    }

    @Test
    fun isPair0() {
        val i = ValidParens.openP
        val j = ValidParens.closedP
        val expected = true
        val actual = ValidParens.isPair(i,j)
        assertEquals(expected, actual)
    }

    @Test
    fun isPair1() {
        val i = ValidParens.openP
        val j = ValidParens.closedCB
        val expected = false
        val actual = ValidParens.isPair(i,j)
        assertEquals(expected, actual)
    }

    @Test
    fun isPair2() {
        val i = ValidParens.openB
        val j = ValidParens.closedB
        val expected = true
        val actual = ValidParens.isPair(i,j)
        assertEquals(expected, actual)
    }

    @Test
    fun isPair4() {
        val i = ValidParens.openB
        val j = ValidParens.closedP // anything else
        val expected = false
        val actual = ValidParens.isPair(i,j)
        assertEquals(expected, actual)
    }

    @Test
    fun isPair5() {
        val i = ValidParens.openCB
        val j = ValidParens.closedCB
        val expected = true
        val actual = ValidParens.isPair(i,j)
        assertEquals(expected, actual)
    }

    @Test
    fun isPair6() {
        val i = ValidParens.openCB
        val j = ValidParens.closedP
        val expected = false
        val actual = ValidParens.isPair(i,j)
        assertEquals(expected, actual)
    }

}