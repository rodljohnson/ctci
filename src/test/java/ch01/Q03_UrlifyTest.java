package ch01;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Q03_UrlifyTest {

  private Q03_Urlify s = new Q03_Urlify();

  @Test
  void withNoSpace() {
    assertArrayEquals("hello".toCharArray(), s.replaceSpaces("hello".toCharArray(), 5));
  }

  @Test
  void withInsufficientLength() {
    s.replaceSpaces("hello world ".toCharArray(), 11);
  }

  @Test
  void withOneSpace() {
    assertArrayEquals("hello%20world".toCharArray(),
        s.replaceSpaces("hello world  ".toCharArray(), 11));
  }

  @Test
  void withTwoSpaces() {
    assertArrayEquals("hello%20world%20bob".toCharArray(),
        s.replaceSpaces("hello world bob    ".toCharArray(), 15));
  }

}
