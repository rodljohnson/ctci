package ch01;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

class Q09_StringRotationTest {

  private Q09_StringRotation s = new Q09_StringRotation();

  @Test
  public void withEmpty() {
    assertTrue(s.isRotation("", ""));
  }

  @Test
  public void withSameWord() {
    assertTrue(s.isRotation("hello", "hello"));
  }

  @Test
  public void withRotated() {
    assertTrue(s.isRotation("hello", "llohe"));
  }

  @Test
  public void withSubstring_ButDifferentSize() {
    assertFalse(s.isRotation("hello", "llo"));
  }

  @Test
  public void withDifferentWords() {
    assertFalse(s.isRotation("hello", "world"));
  }

  @Test
  public void withNotRotated() {
    assertFalse(s.isRotation("hello", "oehll"));
  }

}
