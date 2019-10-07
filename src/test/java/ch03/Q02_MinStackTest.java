package ch03;

import java.util.EmptyStackException;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q02_MinStackTest {

  private Q02_MinStack s = new Q02_MinStack();

  @Test
  public void withDecreasing() {
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
  public void withInterleaving() {
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
  public void withInterleavingActions() {
    s.push(3);
    s.push(5);
    assertEquals(3, s.min());
    s.push(4);
    assertEquals(3, s.min());
    assertEquals(4, s.pop());
    assertEquals(5, s.pop());
    assertEquals(3, s.pop());
  }

  @Test(expected = EmptyStackException.class)
  public void withEmptyStack() {
    s.pop();
  }

}
