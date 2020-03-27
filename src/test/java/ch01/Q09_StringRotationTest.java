package ch01;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Q09_StringRotationTest {

  private Q09_StringRotation s = new Q09_StringRotation();

  @Test
  void withEmpty() {
    assertTrue(s.isRotation("", ""));
  }

  @Test
  void withSameWord() {
    assertTrue(s.isRotation("hello", "hello"));
  }

  @Test
  void withRotated() {
    assertTrue(s.isRotation("hello", "llohe"));
  }

  @Test
  void withSubstring_ButDifferentSize() {
    assertFalse(s.isRotation("hello", "llo"));
  }

  @Test
  void withDifferentWords() {
    assertFalse(s.isRotation("hello", "world"));
  }

  @Test
  void withNotRotated() {
    assertFalse(s.isRotation("hello", "oehll"));
  }

}
