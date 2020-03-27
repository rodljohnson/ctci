package ch01;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Q05_OneAwayTest {

  private Q05_OneAway s = new Q05_OneAway();

  @Test
  void withEmpty() {
    assertTrue(s.oneEditAway("", ""));
  }

  @Test
  void withOneEmpty() {
    assertTrue(s.oneEditAway("", "b"));
  }

  @Test
  void withTwoSingleWords() {
    assertTrue(s.oneEditAway("a", "b"));
  }

  @Test
  void withOneInsertion() {
    assertTrue(s.oneEditAway("pae", "pale"));
  }

  @Test
  void withOneDeletion() {
    assertTrue(s.oneEditAway("pales", "paes"));
  }

  @Test
  void withOneReplace() {
    assertTrue(s.oneEditAway("pawe", "pave"));
  }

  @Test
  public void withMoreEdits() {
    assertFalse(s.oneEditAway("paxye", "pamne"));
  }
}
