package ch08;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Q05_RecursiveMultiplyTest {

  private Q05_RecursiveMultiply s = new Q05_RecursiveMultiply();

  @Test
  public void testOneOne() {
    assertEquals(1, s.multiple(1, 1));
  }

  @Test
  public void testOneTwo() {
    assertEquals(2, s.multiple(1, 2));
  }

  @Test
  public void testFiveNine() {
    assertEquals(45, s.multiple(5, 9));
  }

  @Test
  public void testThirtyForty() {
    assertEquals(1200, s.multiple(40, 30));
  }

}
