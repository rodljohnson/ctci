package ch05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Q04_NextBiggerNumberTest {

  private Q04_NextBiggerNumber s = new Q04_NextBiggerNumber();

  @Test
  void withOne() {
    assertEquals(2, s.nextBigger(1));
  }

  @Test
  void withIntegerTooBig() {
    assertEquals(-1, s.nextBigger(0x4000_0000));
  }

  @Test
  void withTen() {
    assertEquals(12, s.nextBigger(10));
  }

  @Test
  void withManyOnesZeros() {
    assertEquals(0x0008_ff03, s.nextBigger(0x0008_fee0));
  }

}
