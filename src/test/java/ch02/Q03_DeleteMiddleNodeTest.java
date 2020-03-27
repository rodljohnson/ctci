package ch02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Q03_DeleteMiddleNodeTest {

  private Q03_DeleteMiddleNode s = new Q03_DeleteMiddleNode();

  @Test
  void withNull() {
    assertFalse(s.deleteMiddleNode(null));
  }

  @Test
  void withLastNode() {
    assertFalse(s.deleteMiddleNode(LinkedListNode.of(1, 2, 3).next.next));
  }

  @Test
  void withMiddleNode() {
    LinkedListNode input = LinkedListNode.of(1, 2, 3);
    assertTrue(s.deleteMiddleNode(input.next));
    assertEquals(LinkedListNode.of(1, 3), input);
  }

}
