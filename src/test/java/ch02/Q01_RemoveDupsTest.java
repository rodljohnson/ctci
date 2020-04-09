package ch02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Q01_RemoveDupsTest {

  private Q01_RemoveDups s = new Q01_RemoveDups();

  @Test
  void withEmptyList() {
    assertEquals(LinkedListNode.empty(), s.deleteDups(LinkedListNode.empty()));
  }

  @Test
  void withUniqueList() {
    assertEquals(LinkedListNode.of(1, 2, 3, 4), s.deleteDups(LinkedListNode.of(1, 2, 3, 4)));
  }

  @Test
  void withDuplications() {
    assertEquals(LinkedListNode.of(1, 2, 3, 4), s.deleteDups(LinkedListNode.of(1, 2, 2, 3, 2, 4)));
    assertEquals(LinkedListNode.of(1, 2, 3, 4), s.deleteDups(LinkedListNode.of(2, 2, 3, 1, 3, 5, 4, 4)));
  }

}
