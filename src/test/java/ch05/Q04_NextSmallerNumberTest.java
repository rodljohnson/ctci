package ch05;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class Q04_NextSmallerNumberTest {

  private Q04_NextSmallerNumber s = new Q04_NextSmallerNumber();

  @Test
  public void withOne() {
    assertEquals(-1, s.nextSmaller(1));
  }

  @Test
  public void withIntegerTooSmall() {
    assertEquals(-1, s.nextSmaller(3));
  }

  @Test
  public void withTen() {
    assertEquals(9, s.nextSmaller(10));
  }

  @Test
  public void withManyOnesZeros() {
    assertEquals(0x0008_fee0, s.nextSmaller(0x0008_ff03));
  }

}
