package ch08;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import org.junit.Test;

class Q07_PermutationWithoutDupTest {

  private Q07_PermutationWithoutDup s = new Q07_PermutationWithoutDup();

  @Test
  public void withEmptyString() {
    assertEquals(Collections.singleton(""), s.computePermutation(""));
  }

  @Test
  public void withOneChar() {
    assertEquals(Collections.singleton("a"), s.computePermutation("a"));
  }

  @Test
  public void withTwoChars() {
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
