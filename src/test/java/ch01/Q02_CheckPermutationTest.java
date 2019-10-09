package ch01;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

class Q02_CheckPermutationTest {

  private Q02_CheckPermutation s = new Q02_CheckPermutation();

  @Test
  public void withEmptyString() {
    assertTrue(s.permutation("", ""));
  }

  @Test
  public void withOneSingleChar() {
    assertTrue(s.permutation("a", "a"));
  }

  @Test
  public void withOneSingleDifferentChar() {
    assertFalse(s.permutation("a", "b"));
  }

  @Test
  public void withThreeChars() {
    assertTrue(s.permutation("abc", "bac"));
  }

  @Test
  public void withRepeatingChars() {
    assertTrue(s.permutation("aabbc", "bcaba"));
  }

  @Test
  public void withDifferentLength() {
    assertFalse(s.permutation("abc", "ab"));
  }

}
