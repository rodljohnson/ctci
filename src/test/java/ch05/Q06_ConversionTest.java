package ch05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Q06_ConversionTest {

  private Q06_Conversion s = new Q06_Conversion();

  @Test
  void withZeroAndOne() {
    assertEquals(1, s.convert(0, 1));
  }

  @Test
  void withOneAndOne() {
    assertEquals(0, s.convert(1, 1));
  }

  @Test
  void withOneAndTwo() {
    assertEquals(2, s.convert(1, 2));
  }

  @Test
  void withZeroAndThree() {
    assertEquals(2, s.convert(0, 3));
  }

}
