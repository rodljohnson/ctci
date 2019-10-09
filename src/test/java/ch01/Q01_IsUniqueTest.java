package ch01;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

class Q01_IsUniqueTest {

  private Q01_IsUnique s = new Q01_IsUnique();

  @Test
  public void withEmptyString() {
    assertTrue(s.isUniqueChars(""));
  }

  @Test
  public void withUniqueString() {
    assertTrue(s.isUniqueChars("abcde"));
  }

  @Test
  public void withDuplication() {
    assertFalse(s.isUniqueChars("abcda"));
  }

}
