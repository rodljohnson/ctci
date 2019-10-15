package ch10;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ch10.Q04_SortedSearch.Listy;

import org.junit.Test;

public class Q04_SortedSearchTest {

  private Q04_SortedSearch s = new Q04_SortedSearch();

  @Test
  public void withEmptyListy() {
    assertEquals(-1, s.sortedSearch(Listy.of(), 1));
  }

  @Test
  public void withOneElem() {
    assertEquals(0, s.sortedSearch(Listy.of(1), 1));
  }

  @Test
  public void withMultipleElems() {
    assertEquals(3, s.sortedSearch(Listy.of(1, 3, 4, 5, 8, 10), 5));
    assertEquals(-1, s.sortedSearch(Listy.of(1, 3, 4, 5, 8, 10), 6));
  }

  @Test
  public void withDuplicates() {
    int actual = s.sortedSearch(Listy.of(1, 3, 4, 5, 5, 10), 5);
    assertTrue(actual == 3 || actual == 4);
  }

}
