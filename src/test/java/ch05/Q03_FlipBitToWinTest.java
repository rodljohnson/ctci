package ch05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Q03_FlipBitToWinTest {

  private Q03_FlipBitToWin s = new Q03_FlipBitToWin();

  @Test
  public void withZero() {
    assertEquals(1, s.flip(0));
  }

  @Test
  public void withAllOnes() {
    assertEquals(32, s.flip(-1));
  }

  @Test
  public void testWithOne() {
    assertEquals(2, s.flip(1));
  }

  @Test
  public void testWithOneSegment() {
    assertEquals(4, s.flip(0x0000_000b));
  }

  @Test
  public void testWithTwoSegments() {
    assertEquals(5, s.flip(0x00b8_000b));
  }

  @Test
  public void WithContinuesSegment() {
    assertEquals(8, s.flip(0x0000_F700));
  }

}
