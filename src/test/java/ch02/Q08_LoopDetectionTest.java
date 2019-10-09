package ch02;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

class Q08_LoopDetectionTest {

  private Q08_LoopDetection s = new Q08_LoopDetection();

  @Test
  public void withEmptyList() {
    assertNull(s.findBeginning(LinkedListNode.empty()));
  }

  @Test
  public void withListWithoutLoop() {
    assertNull(s.findBeginning(LinkedListNode.of(1, 2, 3)));
  }

  @Test
  public void testWithLoop_FromListHead() {
    LinkedListNode list = LinkedListNode.of(1, 2, 3, 4, 5);
    list.next.next.next.next.next = list;
    assertEquals(1, s.findBeginning(list).val);
  }

  @Test
  public void testWithLoop_FromListTail() {
    LinkedListNode list = LinkedListNode.of(1, 2, 3, 4, 5);
    LinkedListNode tail = list.next.next.next.next;
    tail.next = tail;
    assertEquals(5, s.findBeginning(list).val);
  }

  @Test
  public void testWithLoop_FromListMiddle() {
    LinkedListNode list = LinkedListNode.of(1, 2, 3, 4, 5);
    list.next.next.next.next.next = list.next;
    assertEquals(2, s.findBeginning(list).val);
  }

}
