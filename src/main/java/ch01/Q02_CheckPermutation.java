package ch01;

import java.util.Arrays;

/**
 * Check Permutation: Given two strings,write a method to decide if one is a permutation of the other.
 */
class Q02_CheckPermutation {

  //O(nlog(n)) time
  // O(1) space
  public boolean permutation(String s, String t) {
    return sort(s).equals(sort(t));
  }

  private String sort(String str) {
    char[] arr = str.toCharArray();
    Arrays.sort(arr);
    return new String(arr);
  }

  //O(n) time
  // O(n) space
  /*public boolean permutation(String s, String t) {
    if(s.length() != t.length())
      return false;
    int[] buf = new int[128];
    for(char c : s.toCharArray()) {
      buf[c - 'a']++;
    }
    for(char c : t.toCharArray()) {
      buf[c - 'a']--;
      if(buf[c - 'a'] < 0)
        return false;
    }
    return true;
  }*/

}
