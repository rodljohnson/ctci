package ch02;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

class Q02_ReturnKthToLastTest {

  private Q02_ReturnKthToLast s = new Q02_ReturnKthToLast();

  @Test
  public void withOutOfScopeK() {
    assertNull(s.kthToLast(LinkedListNode.of(1, 2, 3), 3));
  }

  @Test
  public void withZero() {
    assertEquals(3, s.kthToLast(LinkedListNode.of(1, 2, 3), 0).val);
  }

  @Test
  public void withNoneZero() {
    assertEquals(2, s.kthToLast(LinkedListNode.of(1, 2, 3), 1).val);
  }

}
