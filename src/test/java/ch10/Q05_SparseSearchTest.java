package ch10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Q05_SparseSearchTest {

  private final Q05_SparseSearch sparseSearch = new Q05_SparseSearch();

  @Test
  void withEmptyString() {
    assertEquals(-1, sparseSearch.find(new String[]{"hello", "", "world"}, ""));
  }

  @Test
  void withValidString() {
    assertEquals(8, sparseSearch.find(
        new String[]{"hello", "", "", "idea", "", "", "", "", "world", "", "", "", "", "", "xylo", "", ""},
        "world"));

  }

  @Test
  void withManySparse() {
    assertEquals(0, sparseSearch.find(
        new String[]{"hello", "", "", "", "", "", "", "", "", "", "", "", "", ""},
        "hello"));

  }
  @Test
  void withWordInTheEnd() {
    assertEquals(3, sparseSearch.find(
        new String[]{"", "", "", "hello"},
        "hello"));

  }

}
