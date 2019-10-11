package ch08;

import static org.junit.Assert.assertEquals;

import ch08.Q13_StackOfBoxes.Box;
import java.util.Arrays;
import java.util.Collections;
import org.junit.Test;

class Q13_StackOfBoxesTest {

  private final Q13_StackOfBoxes s = new Q13_StackOfBoxes();

  @Test
  public void with0Box() {
    assertEquals(0, s.createStack(Collections.emptyList()));
  }

  @Test
  public void with1Box() {
    assertEquals(1, s.createStack(Collections.singletonList(new Box(1, 1, 1))));
  }

  @Test
  public void with3Boxes() {
    assertEquals(5, s.createStack(Arrays.asList(
        new Box(2, 2, 2),
        new Box(3, 3, 3),
        new Box(3, 3, 4))));
  }

  @Test
  public void with4Boxes() {
    assertEquals(10, s.createStack(Arrays.asList(
        new Box(4, 4, 4),
        new Box(3, 3, 3),
        new Box(2, 2, 2),
        new Box(1, 1, 1))));
  }

}
