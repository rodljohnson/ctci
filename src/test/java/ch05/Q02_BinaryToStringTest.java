package ch05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Q02_BinaryToStringTest {

  private Q02_BinaryToString s = new Q02_BinaryToString();

  @Test
  void withZero() {
    assertEquals("ERROR", s.print(0));
  }

  @Test
  void withOne() {
    assertEquals("ERROR", s.print(1));
  }

  @Test
  void withOneBit() {
    assertEquals(".1", s.print(0.5));
  }

  @Test
  void withTwoBits() {
    assertEquals(".11", s.print(0.75));
  }

  @Test
  void withThreeBits() {
    assertEquals(".101", s.print(0.625));
  }

  @Test
  void withUndoable() {
    assertEquals("ERROR", s.print(0.1));
  }

}
