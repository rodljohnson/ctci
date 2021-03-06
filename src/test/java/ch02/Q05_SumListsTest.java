package ch02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Q05_SumListsTest {

  private Q05_SumLists s = new Q05_SumLists();

  @Test
  void withTwoEmptyLists() {
    assertEquals(LinkedListNode.empty(),
        s.addLists(LinkedListNode.empty(), LinkedListNode.empty()));
  }

  @Test
  void withOneEmptyList() {
    assertEquals(LinkedListNode.of(1, 2, 3),
        s.addLists(LinkedListNode.empty(), LinkedListNode.of(1, 2, 3)));
  }

  @Test
  void withNoCarry() {
    assertEquals(LinkedListNode.of(2, 4, 6),
        s.addLists(LinkedListNode.of(1, 2, 3), LinkedListNode.of(1, 2, 3)));
  }

  @Test
  void withCarry() {
    assertEquals(LinkedListNode.of(5, 3, 5),
        s.addLists(LinkedListNode.of(1, 8, 3), LinkedListNode.of(3, 5, 2)));
  }

  @Test
  void withCarryAtEnd() {
    assertEquals(LinkedListNode.of(1, 1, 4, 1),
        s.addLists(LinkedListNode.of(1, 8, 9), LinkedListNode.of(9, 5, 2)));
  }

  @Test
  void withTwoListsHavingDiffrentLength() {
    assertEquals(LinkedListNode.of(2, 4, 1),
        s.addLists(LinkedListNode.of(1, 8, 9), LinkedListNode.of(5, 2)));
  }

}
