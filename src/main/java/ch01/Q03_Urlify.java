package ch01;

/**
 * URLify: Write a method to replace all spaces in a string with '%20' You may assume that the string has
 * sufficient space at the end to hold the additional characters, and that you are given the "true"
 * length of the string. (Note: If implementing in Java,please use a character array so that you can
 * perform this operation in place.)
 * <p>
 * EXAMPLE Input:  "Mr John Smith    ", 13 Output: "Mr%20John%20Smith"
 */
class Q03_Urlify {

  public char[] replaceSpaces(char[] str, int trueLength) {
    if(str.length - (str.length - trueLength) >= str.length) {
      return str;
    }
    int j = str.length - 1;
    for(int i = str.length - (str.length - trueLength) - 1;i >= 0;i--) {
      if(str[i] == ' ') {
        str[j--] = '0';
        str[j--] = '2';
        str[j--] = '%';
      } else {
        str[j--] = str[i];
      }
    }
    return str;
  }

}
