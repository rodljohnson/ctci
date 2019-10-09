package ch05;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class Q06_ConversionTest {

  private Q06_Conversion s = new Q06_Conversion();

  @Test
  public void withZeroAndOne() {
    assertEquals(1, s.convert(0, 1));
  }

  @Test
  public void withOneAndOne() {
    assertEquals(0, s.convert(1, 1));
  }

  @Test
  public void withOneAndTwo() {
    assertEquals(2, s.convert(1, 2));
  }

  @Test
  public void withZeroAndThree() {
    assertEquals(2, s.convert(0, 3));
  }

}
