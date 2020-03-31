package ch01;

/**
 * One Away: There are three types of edits that can be performed on strings: insert a character, remove a
 * character, or replace a character. Given two strings, write a function to check if they are one
 * edit (or zero edits) away.
 * <p>
 * EXAMPLE pale, ple -> true pales, pale -> true pale, bale -> true pale, bake -> false
 */
class Q05_OneAway {

  public boolean oneEditAway(String a, String b) {
    if(Math.abs(a.length() - b.length()) > 1) {
      return false;
    }
    String s1 = (a.length() < b.length()) ? b : a;
    String s2 = (a.length() < b.length()) ? a : b;
    int index1 = 0;
    int index2 = 0;
    boolean isOne = false;
    while(index2 < s2.length()) {
      if(s1.charAt(index1) != s2.charAt(index2)) {
        if(isOne)
          return false;
        isOne = true;
        if(s1.length() > s2.length()) {
          index1++;
        } else {
          index1++;
          index2++;
        }
      } else {
        index1++;
        index2++;
      }
    }
    return true;
  }
}
