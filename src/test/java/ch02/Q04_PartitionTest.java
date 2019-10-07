package ch02;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q04_PartitionTest {

    private Q04_Partition s = new Q04_Partition();

    @Test
    public void withEmptyList() {
        assertEquals(LinkedListNode.empty(), s.partition(LinkedListNode.empty(), 8));
    }

    @Test
    public void withSortedList() {
        assertEquals(LinkedListNode.of(1, 2, 3), s.partition(LinkedListNode.of(1, 2, 3), 2));
    }

    @Test
    public void withSortedList_AndOutOfListX() {
        assertEquals(LinkedListNode.of(3, 2, 1), s.partition(LinkedListNode.of(1, 2, 3), 4));
    }

    @Test
    public void withSortedList_AndOutOfListX_Smaller() {
        assertEquals(LinkedListNode.of(1, 2, 3), s.partition(LinkedListNode.of(1, 2, 3), 0));
    }

    @Test
    public void withUnSortedList() {
        assertEquals(LinkedListNode.of(1, 2, 4, 3, 5), s.partition(LinkedListNode.of(4, 3, 2, 5, 1), 3));
    }

    @Test
    public void withUnSortedList_AndOutOfScopeX() {
        assertEquals(LinkedListNode.of(1, 2, 4, 3, 6), s.partition(LinkedListNode.of(3, 4, 2, 6, 1), 5));
    }
}
