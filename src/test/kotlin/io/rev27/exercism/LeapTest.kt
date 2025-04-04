package io.rev27.exercism

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class LeapTest {
    @Test
    fun `not leap - not divisible by 4`() = assertYearIsCommon(2015)

    @Test
    fun `not leap - divisible by 2, not divisible by 4`() = assertYearIsCommon(1970)

    @Test
    fun `leap - divisible by 4, not divisible by 100`() = assertYearIsLeap(1996)

    @Test
    fun `leap - divisible by 4 and 5`() = assertYearIsLeap(1960)

    @Test
    fun `not leap - divisible by 100, not divisible by 400`() = assertYearIsCommon(2100)

    @Test
    fun `not leap - divisible by 100 but not by 3`() = assertYearIsCommon(1900)

    @Test
    fun `leap - divisible by 400`() = assertYearIsLeap(2000)

    @Test
    fun `leap - divisible by 400 but not by 125`() = assertYearIsLeap(2400)

    @Test
    fun `not leap - divisible by 200, not divisible by 400`() = assertYearIsCommon(1800)
}

private fun assertYearIsLeap(year: Int) = assertTrue(Year(year).isLeap)

private fun assertYearIsCommon(year: Int) = assertFalse(Year(year).isLeap)
