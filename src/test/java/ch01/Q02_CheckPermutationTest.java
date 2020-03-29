package ch01;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Q02_CheckPermutationTest {

  private Q02_CheckPermutation s = new Q02_CheckPermutation();

  @Test
   void withEmptyString() {
    assertTrue(s.permutation("", ""));
  }

  @Test
  void withOneSingleChar() {
    assertTrue(s.permutation("a", "a"));
  }

  @Test
  void withOneSingleDifferentChar() {
    assertFalse(s.permutation("a", "b"));
  }

  @Test
  void withThreeChars() {
    assertTrue(s.permutation("abc", "bac"));
  }

  @Test
  void withRepeatingChars() {
    assertTrue(s.permutation("aabbc", "bcaba"));
  }

  @Test
  void withDifferentLength() {
    assertFalse(s.permutation("abc", "ab"));
  }

  @Test
  void withPairs() {
    assertTrue(s.permutation("apple", "papel"));
    assertTrue(s.permutation("carrot", "tarroc"));
    assertFalse(s.permutation("hello", "llloh"));
  }

}
