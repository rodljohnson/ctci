package ch02;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class Q01_RemoveDupsTest {

  private Q01_RemoveDups s = new Q01_RemoveDups();

  @Test
  public void withEmptyList() {
    assertEquals(LinkedListNode.empty(), s.deleteDups(LinkedListNode.empty()));
  }

  @Test
  public void withUniqueList() {
    assertEquals(LinkedListNode.of(1, 2, 3, 4), s.deleteDups(LinkedListNode.of(1, 2, 3, 4)));
  }

  @Test
  public void withDuplications() {
    assertEquals(LinkedListNode.of(1, 2, 3, 4), s.deleteDups(LinkedListNode.of(1, 2, 2, 3, 2, 4)));
  }

}
