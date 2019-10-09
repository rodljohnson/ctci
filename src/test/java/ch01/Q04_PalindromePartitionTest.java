package ch01;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

class Q04_PalindromePartitionTest {

  private Q04_PalindromePartition s = new Q04_PalindromePartition();

  @Test
  public void withEmpty() {
    assertTrue(s.isPermutationOfPalindrome(""));
  }

  @Test
  public void withOneChar() {
    assertTrue(s.isPermutationOfPalindrome("a"));
  }

  @Test
  public void withTwoWords_OddLetters() {
    assertTrue(s.isPermutationOfPalindrome("acto tac"));
  }

  @Test
  public void withTwoWords_OddLetters_ThreeOccurences() {
    assertTrue(s.isPermutationOfPalindrome("act atac"));
  }

  @Test
  public void withTwoWords_EvenLetters() {
    assertTrue(s.isPermutationOfPalindrome("act cat"));
  }

}
