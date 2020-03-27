package ch10;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class Q01_SortedMergeTest {

  private Q01_SortedMerge s = new Q01_SortedMerge();

  @Test
  void withOneElementEach() {
    assertTrue(Arrays.equals(new int[] {1, 2}, s.merge(new int[] {2, 0}, new int[] {1})));
  }

  @Test
  void withMultipleElementsEach() {
    assertTrue(Arrays
        .equals(new int[] {2, 3, 4, 5, 6}, s.merge(new int[] {2, 4, 6, 0, 0}, new int[] {3, 5})));
  }

}
