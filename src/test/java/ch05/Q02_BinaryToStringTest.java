package ch05;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class Q02_BinaryToStringTest {

  private Q02_BinaryToString s = new Q02_BinaryToString();

  @Test
  public void withZero() {
    assertEquals("ERROR", s.print(0));
  }

  @Test
  public void withOne() {
    assertEquals("ERROR", s.print(1));
  }

  @Test
  public void withOneBit() {
    assertEquals(".1", s.print(0.5));
  }

  @Test
  public void withTwoBits() {
    assertEquals(".11", s.print(0.75));
  }

  @Test
  public void withThreeBits() {
    assertEquals(".101", s.print(0.625));
  }

  @Test
  public void withUndoable() {
    assertEquals("ERROR", s.print(0.1));
  }

}
