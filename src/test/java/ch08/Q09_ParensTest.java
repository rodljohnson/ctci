package ch08;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import org.junit.Test;

class Q09_ParensTest {

  private final Q09_Parens s = new Q09_Parens();

  @Test
  public void withZeroPair() {
    assertEquals(Collections.emptySet(), s.combine(0));
  }

  @Test
  public void withOnePair() {
    assertEquals(Collections.singleton("()"), s.combine(1));
  }

  @Test
  public void withTwoPairs() {
    assertEquals(new HashSet<>(Arrays.asList("()()", "(())")), s.combine(2));
  }

  @Test
  public void withThreePairs() {
    assertEquals(new HashSet<>(Arrays.asList(
        "((()))",
        "(()())",
        "(())()",
        "()(())",
        "()()()")), s.combine(3));
  }

}
