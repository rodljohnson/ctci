package ch08;

import static org.junit.Assert.assertEquals;

import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import org.junit.Test;

class Q02_RobotInAGridTest {

  private Q02_RobotInAGrid s = new Q02_RobotInAGrid();

  @Test
  public void withAllFeasibleCells() {
    boolean[][] grid = new boolean[][] {
        {true, true, true},
        {true, true, true},
        {true, true, true}
    };

    assertEquals(Arrays.asList(
        new Point(0, 0), new Point(0, 1),
        new Point(0, 2), new Point(1, 2),
        new Point(2, 2)), s.findPath(grid));
  }

  @Test
  public void withSomeBrokenCells() {
    boolean[][] grid = new boolean[][] {
        {true, true, true},
        {true, true, false},
        {false, true, true}
    };

    assertEquals(Arrays.asList(
        new Point(0, 0), new Point(0, 1),
        new Point(1, 1), new Point(2, 1),
        new Point(2, 2)), s.findPath(grid));
  }

  @Test
  public void withNoPath() {
    boolean[][] grid = new boolean[][] {
        {true, true, true},
        {true, true, false},
        {false, false, true}
    };

    assertEquals(Collections.emptyList(), s.findPath(grid));
  }

}
