package io.rev27.cracking.ch1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class OffByOneTest {

    @Test
    fun offByOne0() {
        assertTrue(OffByOne.offByOne("", "x"))
    }
    @Test
    fun offByOne1() {
        assertFalse(OffByOne.offByOne("xx", "xxxx"))
    }
    @Test
    fun offByOne2() {
        assertFalse(OffByOne.offByOne("xxxx", "xx"))
    }
    @Test
    fun offByOne3() {
        assertFalse(OffByOne.offByOne("xxxxxx", "xx"))
    }
    @Test
    fun offByOne4() {
        assertTrue(OffByOne.offByOne("x", "x"))
    }
    @Test
    fun offByOne5() {
        assertTrue(OffByOne.offByOne("pale", "ple"))
    }
    @Test
    fun offByOne6() {
        assertTrue(OffByOne.offByOne("pale", "pale"))
    }
    @Test
    fun offByOne7() {
        assertTrue(OffByOne.offByOne("pale", "pales"))
    }
    @Test
    fun offByOne8() {
        assertTrue(OffByOne.offByOne("pales", "pale"))
    }
    @Test
    fun offByOne9() {
        assertFalse(OffByOne.offByOne("pales", "bale"))
    }
    @Test
    fun offByOne10() {
        assertFalse(OffByOne.offByOne("pale", "bake"))
    }
}
