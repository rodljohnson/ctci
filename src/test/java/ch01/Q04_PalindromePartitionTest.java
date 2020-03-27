package ch01;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Q04_PalindromePartitionTest {

  private Q04_PalindromePartition s = new Q04_PalindromePartition();

  @Test
  void withEmpty() {
    assertTrue(s.isPermutationOfPalindrome(""));
  }

  @Test
  void withOneChar() {
    assertTrue(s.isPermutationOfPalindrome("a"));
  }

  @Test
  void withTwoWords_OddLetters() {
    assertTrue(s.isPermutationOfPalindrome("acto tac"));
  }

  @Test
  void withTwoWords_OddLetters_ThreeOccurences() {
    assertTrue(s.isPermutationOfPalindrome("act atac"));
  }

  @Test
  void withTwoWords_EvenLetters() {
    assertTrue(s.isPermutationOfPalindrome("act cat"));
  }

}
