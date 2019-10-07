package ch03;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q06_AnimalQueueTest {

  private Q06_AnimalQueue s = new Q06_AnimalQueue();

  @Test
  public void withOrdinaryQueue() {
    s.enqueueCat(5);
    s.enqueueDog(4);
    s.enqueueCat(6);
    s.enqueueCat(7);

    assertEquals(5, s.dequeueAny());
    assertEquals(4, s.dequeueAny());
    assertEquals(6, s.dequeueAny());
    assertEquals(7, s.dequeueAny());
  }

  @Test
  public void withCatDogOldest() {
    s.enqueueCat(5);
    s.enqueueCat(3);
    s.enqueueDog(6);
    s.enqueueDog(2);
    s.enqueueCat(1);

    assertEquals(6, s.dequeueDog());
    assertEquals(5, s.dequeueAny());
    assertEquals(3, s.dequeueAny());
    assertEquals(1, s.dequeueCat());
    assertEquals(2, s.dequeueDog());
  }

}
