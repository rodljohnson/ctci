package ch01;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class Q08_ZeroMatrixTest {

  private Q08_ZeroMatrix s = new Q08_ZeroMatrix();

  @Test
  void withEmpty() {
    assertTrue(Arrays.deepEquals(new int[][] {{}}, s.zero(new int[][] {{}})));
  }

  @Test
  void withOneOne() {
    assertTrue(Arrays.deepEquals(new int[][] {{1}}, s.zero(new int[][] {{1}})));
  }

  @Test
  void withOneOne_Zero() {
    assertTrue(Arrays.deepEquals(new int[][] {{0}}, s.zero(new int[][] {{0}})));
  }

  @Test
  void withOneTwo() {
    assertTrue(Arrays.deepEquals(new int[][] {{0, 0}}, s.zero(new int[][] {{0, 0}})));
  }

  @Test
  void withTwoTwo() {
    assertTrue(
        Arrays.deepEquals(new int[][] {{0, 0}, {0, 1}}, s.zero(new int[][] {{0, 1}, {1, 1}})));
  }

  @Test
  void withThreeTree() {
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

    assertTrue(Arrays.deepEquals(
        new int[][] {
            {0, 0, 0},
            {4, 5, 0},
            {7, 8, 0}
        }, s.zero(
            new int[][] {
                {1, 2, 0},
                {4, 5, 6},
                {7, 8, 9}
            })));

    assertTrue(Arrays.deepEquals(
        new int[][] {
            {0, 2, 3},
            {0, 0, 0},
            {0, 8, 9}
        }, s.zero(
            new int[][] {
                {1, 2, 3},
                {0, 5, 6},
                {7, 8, 9}
            })));

    assertTrue(Arrays.deepEquals(
        new int[][] {
            {0, 2, 0},
            {0, 0, 0},
            {0, 0, 0}
        }, s.zero(
            new int[][] {
                {1, 2, 3},
                {0, 5, 6},
                {0, 8, 0}
            })));
  }

}
