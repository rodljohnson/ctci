package ch01;

/**
 * Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is
 * a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of
 * letters. The palindrome does not need to be limited to just dictionary words.
 * <p>
 * EXAMPLE Input: Tact Coa Output: True (permutations: "taco cat", "atco cta", etc.)
 */
class Q04_PalindromePartition {

  public boolean isPermutationOfPalindrome(String str) {
    int[] buf = new int[26];
    for(char c : str.toCharArray()) {
      if(Character.isLetter(c)) {
        buf[c - 'a']++;
      }
    }
    boolean isOdd = false;
    for(int n : buf) {
      if(n % 2 == 1) {
        if(isOdd) {
          return false;
        }
        isOdd = true;
      }
    }
    return true;
  }

}
