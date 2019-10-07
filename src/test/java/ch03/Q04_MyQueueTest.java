package ch03;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q04_MyQueueTest {

  private Q04_MyQueue s = new Q04_MyQueue();

  @Test
  public void withAllEnqueueAndAllDequeue() {
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
  public void withInterleavingEnqueueAndDequeue() {
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

  @Test(expected = RuntimeException.class)
  public void withEmptyQueue() {
    s.enqueue(1);
    s.dequeue();
    s.dequeue();
  }

}