package io.rev27

import io.rev27.ExTwo.Companion.doCalc
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ExTwoTest {

    @Test
    fun calcTest() {

        val et = ExTwo()

        val foo: Foo = Foo(21, 2)
        val expected = 42
        val actual = doCalc(foo)
        assertEquals(expected, actual)
    }
}