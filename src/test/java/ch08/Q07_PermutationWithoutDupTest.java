package ch08;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import org.junit.jupiter.api.Test;

class Q07_PermutationWithoutDupTest {

  private Q07_PermutationWithoutDup s = new Q07_PermutationWithoutDup();

  @Test
  void withEmptyString() {
    assertEquals(Collections.singleton(""), s.computePermutation(""));
  }

  @Test
  void withOneChar() {
    assertEquals(Collections.singleton("a"), s.computePermutation("a"));
  }

  @Test
  void withTwoChars() {
    assertEquals(new HashSet<>(Arrays.asList("ab", "ba")), s.computePermutation("ab"));
    assertEquals(new HashSet<>(Arrays.asList("ab", "ba")), s.computePermutation("ba"));
  }

  @Test
  public void withThreeChars() {
    HashSet<String> result = new HashSet<>(Arrays.asList("abc", "acb", "bca", "bac", "cab", "cba"));
    assertEquals(result, s.computePermutation("abc"));
    assertEquals(result, s.computePermutation("acb"));
    assertEquals(result, s.computePermutation("bca"));
  }

}
