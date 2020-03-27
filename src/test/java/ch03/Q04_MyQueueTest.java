package ch03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class Q04_MyQueueTest {

  private Q04_MyQueue s = new Q04_MyQueue();

  @Test
  void withAllEnqueueAndAllDequeue() {
    s.enqueue(1);
    s.enqueue(2);
    s.enqueue(3);
    assertEquals(3, s.size());
    assertEquals(1, s.dequeue());
    assertEquals(2, s.size());
    assertEquals(2, s.dequeue());
    assertEquals(3, s.dequeue());
  }

  @Test
  void withInterleavingEnqueueAndDequeue() {
    s.enqueue(1);
    assertEquals(1, s.dequeue());
    s.enqueue(2);
    s.enqueue(3);
    assertEquals(2, s.peek());
    assertEquals(2, s.dequeue());
    s.enqueue(4);
    assertEquals(3, s.dequeue());
    assertEquals(4, s.dequeue());
  }

  @Test
  void withEmptyQueue() {
    s.enqueue(1);
    s.dequeue();
    assertThrows((RuntimeException.class), () -> s.dequeue());
  }

}
