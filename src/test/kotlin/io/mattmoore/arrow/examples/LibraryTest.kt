package io.mattmoore.arrow.examples

import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertEquals

import arrow.*
import arrow.core.*

class LibraryTest {
    val classUnderTest = Library()

    @Test fun `passing an acceptable value`() {
        assertEquals(classUnderTest.someValue("Acceptable"), Some("Acceptable"))
    }

    @Test fun `passing an unacceptable value`() {
        assertEquals(classUnderTest.someValue("Unacceptable"), None)
    }

    @Test fun `passing an unacceptable value and using getOrElse`() {
        assertEquals(classUnderTest.someValue("Unacceptable").getOrElse { "No value" }, "No value")
    }

    @Test fun `Dave's test`() {
      val some10 = Some(10)
      val some11 = some10.map { it + 1 }
      val result = "Some 11 = " + some11.getOrElse { "n/a" }
      assertEquals(result, "Some 11 = 11")
    }
}
