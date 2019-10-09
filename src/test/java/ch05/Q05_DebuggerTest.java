package ch05;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

class Q05_DebuggerTest {

  private Q05_Debugger s = new Q05_Debugger();

  @Test
  public void withZero() {
    assertTrue(s.debug(0));
  }

  @Test
  public void withOne() {
    assertTrue(s.debug(1));
  }

  @Test
  public void withTwo() {
    assertTrue(s.debug(2));
  }

  @Test
  public void withThree() {
    assertFalse(s.debug(3));
  }

  @Test
  public void withFour() {
    assertTrue(s.debug(4));
  }

  @Test
  public void withFive() {
    assertFalse(s.debug(5));
  }

}
