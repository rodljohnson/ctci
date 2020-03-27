package ch05;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Q05_DebuggerTest {

  private Q05_Debugger s = new Q05_Debugger();

  @Test
  void withZero() {
    assertTrue(s.debug(0));
  }

  @Test
  void withOne() {
    assertTrue(s.debug(1));
  }

  @Test
  void withTwo() {
    assertTrue(s.debug(2));
  }

  @Test
  void withThree() {
    assertFalse(s.debug(3));
  }

  @Test
  void withFour() {
    assertTrue(s.debug(4));
  }

  @Test
  void withFive() {
    assertFalse(s.debug(5));
  }

}
