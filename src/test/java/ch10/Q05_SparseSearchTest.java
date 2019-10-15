package ch10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class Q05_SparseSearchTest {

  private final Q05_SparseSearch sparseSearch = new Q05_SparseSearch();

  @Test
  public void withEmptyString() {
    assertEquals(-1, sparseSearch.find(new String[]{"hello", "", "world"}, ""));
  }

  @Test
  public void withValidString() {
    assertEquals(8, sparseSearch.find(
        new String[]{"hello", "", "", "idea", "", "", "", "", "world", "", "", "", "", "", "xylo", "", ""},
        "world"));

  }

  @Test
  public void withManySparse() {
    assertEquals(0, sparseSearch.find(
        new String[]{"hello", "", "", "", "", "", "", "", "", "", "", "", "", ""},
        "hello"));

  }
  @Test
  public void withWordInTheEnd() {
    assertEquals(3, sparseSearch.find(
        new String[]{"", "", "", "hello"},
        "hello"));

  }

}
