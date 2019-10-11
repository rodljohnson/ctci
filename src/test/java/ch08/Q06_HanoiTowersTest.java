package ch08;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

class Q06_HanoiTowersTest {

  private Q06_HanoiTowers s = new Q06_HanoiTowers();

  @Test
  public void withOneDisk() {
    assertEquals(Arrays.asList(1, 3), s.leftToRight(1));
  }

  @Test
  public void withTwoDisk() {
    assertEquals(Arrays.asList(
        1, 2,
        1, 3,
        2, 3
    ), s.leftToRight(2));
  }

  @Test
  public void withThreeDisks() {
    assertEquals(Arrays.asList(
        1, 3,
        1, 2,
        3, 2,
        1, 3,
        2, 1,
        2, 3,
        1, 3
    ), s.leftToRight(3));

  }

}
