package ch01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Q06_StringCompressionTest {

  private Q06_StringCompression s = new Q06_StringCompression();

  @Test
  void withOneSingleChar() {
    assertEquals("a", s.compress("a"));
  }

  @Test
  void withTwoChars() {
    assertEquals("aa", s.compress("aa"));
  }

  @Test
  void withThreeChars() {
    assertEquals("a3", s.compress("aaa"));
  }

  @Test
  void withDifferentChars() {
    assertEquals("aaab", s.compress("aaab"));
  }

  @Test
  void withDifferentChars_RepeatingSeveralTimes() {
    assertEquals("a3b2", s.compress("aaabb"));
  }

  @Test
  void withDifferentChars_RepeatingInMoreSeqs() {
    assertEquals("a3b2a2", s.compress("aaabbaa"));
  }

}
