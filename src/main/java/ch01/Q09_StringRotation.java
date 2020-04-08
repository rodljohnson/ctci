package ch01;

/**
 * String Rotation; Assume you have a method isSubstring which checks if one word is a substring of another. Given
 * two strings, sl and s2, write code to check if s2 is a rotation of s1 using only one call to
 * isSubstring (e.g.,"waterbottle" is a rotation of"erbottlewat").
 */
class Q09_StringRotation {

  public boolean isRotation(String s1, String s2) {
    if(s1.length()!= s2.length())
      return false;
    String str = s1 + s1;
    for(int i = 0;i < str.length() - s2.length();i++) {
      if(str.substring(i, i + s2.length()).equals(s2)) {
        return true;
      }
    }
    return false;
  }

}
