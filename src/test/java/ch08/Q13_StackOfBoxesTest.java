package ch08;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ch08.Q13_StackOfBoxes.Box;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class Q13_StackOfBoxesTest {

  private final Q13_StackOfBoxes s = new Q13_StackOfBoxes();

  @Test
  void with0Box() {
    assertEquals(0, s.createStack(Collections.emptyList()));
  }

  @Test
  void with1Box() {
    assertEquals(1, s.createStack(Collections.singletonList(new Box(1, 1, 1))));
  }

  @Test
  void with3Boxes() {
    assertEquals(5, s.createStack(Arrays.asList(
        new Box(2, 2, 2),
        new Box(3, 3, 3),
        new Box(3, 3, 4))));
  }

  @Test
  void with4Boxes() {
    assertEquals(10, s.createStack(Arrays.asList(
        new Box(4, 4, 4),
        new Box(3, 3, 3),
        new Box(2, 2, 2),
        new Box(1, 1, 1))));
  }

}
