package ch02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Q03_DeleteMiddleNodeTest {

  private Q03_DeleteMiddleNode s = new Q03_DeleteMiddleNode();

  @Test
  void withNull() {
    assertFalse(s.deleteMiddleNode(LinkedListNode.empty()));

    LinkedListNode input = LinkedListNode.of(1);
    assertFalse(s.deleteMiddleNode(input));
  }

  @Test
  void withLastNode() {
    LinkedListNode input = LinkedListNode.of(1, 2, 3);
    s.deleteMiddleNode(input.next.next);
    assertEquals(LinkedListNode.of(1, 2, 3), input);
  }

  @Test
  void withMiddleNode() {
    LinkedListNode input = LinkedListNode.of(1, 2, 3);
    s.deleteMiddleNode(input.next);
    assertEquals(LinkedListNode.of(1, 3), input);
  }

  @Test
  void withNodes() {
    LinkedListNode input1 = LinkedListNode.of(4, 5, 1, 9);
    s.deleteMiddleNode(input1.next.next);
    assertEquals(LinkedListNode.of(4, 1, 9), input1);

    LinkedListNode input2 = LinkedListNode.of(4, 5, 1, 9);
    s.deleteMiddleNode(input2.next.next);
    assertEquals(LinkedListNode.of(4, 5, 9), input2);
  }

}
