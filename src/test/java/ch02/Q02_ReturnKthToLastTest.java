package ch02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class Q02_ReturnKthToLastTest {

  private Q02_ReturnKthToLast s = new Q02_ReturnKthToLast();

  @Test
  void withOutOfScopeK() {
    assertNull(s.kthToLast(LinkedListNode.of(1, 2, 3), 3));
  }

  @Test
  void withZero() {
    assertEquals(3, s.kthToLast(LinkedListNode.of(1, 2, 3), 0).val);
  }

  @Test
  void withNoneZero() {
    assertEquals(2, s.kthToLast(LinkedListNode.of(1, 2, 3), 1).val);
  }

}
