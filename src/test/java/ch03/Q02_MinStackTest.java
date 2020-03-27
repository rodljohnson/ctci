package ch03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;
import org.junit.jupiter.api.Test;

class Q02_MinStackTest {

  private Q02_MinStack s = new Q02_MinStack();

  @Test
  void withDecreasing() {
    s.push(3);
    s.push(2);
    s.push(1);
    assertEquals(1, s.min());
    assertEquals(1, s.pop());
    assertEquals(2, s.min());
    assertEquals(2, s.pop());
    assertEquals(3, s.min());
    assertEquals(3, s.pop());
  }

  @Test
  void withInterleaving() {
    s.push(3);
    s.push(5);
    s.push(2);
    s.push(6);
    s.push(1);

    assertEquals(1, s.min());
    assertEquals(1, s.pop());
    assertEquals(2, s.min());
    assertEquals(6, s.pop());
    assertEquals(2, s.min());
    assertEquals(2, s.pop());
    assertEquals(3, s.min());
    assertEquals(5, s.pop());
  }

  @Test
  void withInterleavingActions() {
    s.push(3);
    s.push(5);
    assertEquals(3, s.min());
    s.push(4);
    assertEquals(3, s.min());
    assertEquals(4, s.pop());
    assertEquals(5, s.pop());
    assertEquals(3, s.pop());
  }

  @Test
  void withEmptyStack() {
    assertThrows((RuntimeException.class), () -> s.pop());
  }

}
