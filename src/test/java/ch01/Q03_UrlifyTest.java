package ch01;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

class Q03_UrlifyTest {

  private Q03_Urlify s = new Q03_Urlify();

  @Test
  public void withNoSpace() {
    assertArrayEquals("hello".toCharArray(), s.replaceSpaces("hello".toCharArray(), 5));
  }

  @Test(expected = IllegalArgumentException.class)
  public void withInsufficientLength() {
    s.replaceSpaces("hello world ".toCharArray(), 11);
  }

  @Test
  public void withOneSpace() {
    assertArrayEquals("hello%20world".toCharArray(),
        s.replaceSpaces("hello world  ".toCharArray(), 11));
  }

  @Test
  public void withTwoSpaces() {
    assertArrayEquals("hello%20world%20bob".toCharArray(),
        s.replaceSpaces("hello world bob    ".toCharArray(), 15));
  }

}
