package ch01;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Test;

class Q08_ZeroMatrixTest {

  private Q08_ZeroMatrix s = new Q08_ZeroMatrix();

  @Test
  public void withEmpty() {
    assertTrue(Arrays.deepEquals(new int[][] {{}}, s.zero(new int[][] {{}})));
  }

  @Test
  public void withOneOne() {
    assertTrue(Arrays.deepEquals(new int[][] {{1}}, s.zero(new int[][] {{1}})));
  }

  @Test
  public void withOneOne_Zero() {
    assertTrue(Arrays.deepEquals(new int[][] {{0}}, s.zero(new int[][] {{0}})));
  }

  @Test
  public void withOneTwo() {
    assertTrue(Arrays.deepEquals(new int[][] {{0, 0}}, s.zero(new int[][] {{0, 0}})));
  }

  @Test
  public void withTwoTwo() {
    assertTrue(
        Arrays.deepEquals(new int[][] {{0, 0}, {0, 1}}, s.zero(new int[][] {{0, 1}, {1, 1}})));
  }

  @Test
  public void withThreeTree() {
    assertTrue(Arrays.deepEquals(
        new int[][] {
            {1, 0, 3},
            {0, 0, 0},
            {7, 0, 9}
        }, s.zero(
            new int[][] {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
            })));
  }

}
