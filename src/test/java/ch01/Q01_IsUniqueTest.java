package ch01;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Q01_IsUniqueTest {

  private Q01_IsUnique s = new Q01_IsUnique();

  @Test
  void withEmptyString() {
    assertTrue(s.isUniqueChars(""));
  }

  @Test
  void withUniqueString() {
    assertTrue(s.isUniqueChars("abcde"));
  }

  @Test
  void withDuplication() {
    assertFalse(s.isUniqueChars("abcda"));
  }

}
