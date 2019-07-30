package io.mattmoore.arrow.examples

import arrow.*
import arrow.core.*

class Library {
  fun someValue(x: String): Option<String> = if (x == "Acceptable") Some(x) else None
}
