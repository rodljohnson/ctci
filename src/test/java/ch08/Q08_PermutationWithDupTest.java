package ch08;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import org.junit.Test;

class Q08_PermutationWithDupTest {

  private Q08_PermutationWithDup s = new Q08_PermutationWithDup();

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
    assertEquals(Collections.singleton("aa"), s.computePermutation("aa"));
  }

  @Test
  public void withThreeChars() {
    HashSet<String> result = new HashSet<>(Arrays.asList("aab", "aba", "baa"));
    assertEquals(result, s.computePermutation("aba"));
  }

  @Test
  public void withManySameChar() {
    String str = "aaaaaaaaaaaa";
    assertEquals(Collections.singleton(str), s.computePermutation(str));
  }

}
