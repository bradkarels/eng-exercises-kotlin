package io.rev27.cracking.ch1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

// Lots of pre-conditions and assumptions in the "requirements" so tests are light.
class URLifyTest {

    @Test
    fun urlify() {
        val given = "Mr John Smith    "
        val expected = "Mr%20John%20Smith"
        val actual = URLify.urlify(given)
        assertEquals(expected, actual)
    }

    @Test
    fun urlifyRequiresLeftTrim() {
        val given = "        Mr John Smith    "
        val expected = "Mr%20John%20Smith"
        val actual = URLify.urlify(given)
        assertEquals(expected, actual)
    }

    @Test
    fun urlify_another() {
        val given =    "A man a plan a canal Panama            "
        val expected = "A%20man%20a%20plan%20a%20canal%20Panama"
        val actual = URLify.urlify(given)
        assertEquals(expected, actual)
    }
}
