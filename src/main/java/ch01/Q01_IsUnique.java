package ch01;

import java.util.HashSet;
import java.util.Set;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 */
class Q01_IsUnique {

  //O(n) time
  //O(n) space
  public boolean isUniqueChars(String str) {
    Set<Character> set = new HashSet<>();
    for(char c : str.toCharArray()) {
      if(!set.add(c))
        return false;
    }
    return true;
  }

  //O(n^2) time
  //O(1) space
  /*public boolean isUniqueChars(String str) {
    for(int i = 0;i < str.length();i++) {
      for(int j = i + 1;j < str.length();j++) {
       if(str.charAt(i) == str.charAt(j)) {
         return false;
       }
      }
    }
    return true;
  }*/

}
