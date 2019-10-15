package ch10;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

class Q03_SearchInRotatedArrayTest {

  private Q03_SearchInRotatedArray s = new Q03_SearchInRotatedArray();

  @Test
  public void withOneElement() {
    assertEquals(-1, s.find(new int[]{1}, 2));
    assertEquals(0, s.find(new int[]{1}, 1));
  }

  @Test
  public void withTwoElement() {
    assertEquals(1, s.find(new int[]{2, 1}, 1));
    assertEquals(0, s.find(new int[]{2, 1}, 2));
    assertEquals(-1, s.find(new int[]{2, 1}, 0));
  }

  @Test
  public void withMultipleElements() {
    assertEquals(8, s.find(new int[]{15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14}, 5));
  }

  @Test
  public void withDuplicates() {
    assertEquals(8, s.find(new int[]{20, 20, 20, 20, 20, 20, 20, 20, 5, 7, 10, 14}, 5));
    int r = s.find(new int[]{20, 20, 20, 20, 20, 20, 20, 20, 5, 7, 10, 14}, 20);
    assertTrue(r >= 0 && r <= 7);
  }

}
