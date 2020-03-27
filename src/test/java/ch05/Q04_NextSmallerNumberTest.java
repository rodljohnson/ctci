package ch05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Q04_NextSmallerNumberTest {

  private Q04_NextSmallerNumber s = new Q04_NextSmallerNumber();

  @Test
  void withOne() {
    assertEquals(-1, s.nextSmaller(1));
  }

  @Test
  void withIntegerTooSmall() {
    assertEquals(-1, s.nextSmaller(3));
  }

  @Test
  void withTen() {
    assertEquals(9, s.nextSmaller(10));
  }

  @Test
  void withManyOnesZeros() {
    assertEquals(0x0008_fee0, s.nextSmaller(0x0008_ff03));
  }

}
