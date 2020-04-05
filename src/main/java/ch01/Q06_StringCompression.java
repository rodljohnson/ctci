package ch01;

/**
 * String Compression: Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, the string aabcccccaaa would become a2blc5a3. If the "compressed" string would not
 * become smaller than the original string, your method should return the original string. You can
 * assume the string has only uppercase and lowercase letters (a - z).
 */
class Q06_StringCompression {

  public String compress(String str) {
    StringBuilder sb = new StringBuilder();
    int count = 0;
    for(int i = 0;i < str.length();i++) {
      count++;
      if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
        sb.append(str.charAt(i));
        sb.append(count);
        count = 0;
      }
    }
    return (sb.length() < str.length()) ? sb.toString() : str;
  }

}
