package ch05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Q07_PairwiseSwapTest {

  private Q07_PairwiseSwap s = new Q07_PairwiseSwap();

  @Test
  void withZero() {
    assertEquals(0, s.swap(0));
  }

  @Test
  void withOne() {
    assertEquals(2, s.swap(1));
  }

  @Test
  void withTwo() {
    assertEquals(1, s.swap(2));
  }

  @Test
  void withTen() {
    assertEquals(5, s.swap(10));
  }

  @Test
  void withTenEveryWhere() {
    assertEquals(0x5555_5555, s.swap(0xaaaa_aaaa));
  }

}
