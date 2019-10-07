package ch02;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q03_DeleteMiddleNodeTest {

    private Q03_DeleteMiddleNode s = new Q03_DeleteMiddleNode();

    @Test
    public void withNull() {
        assertFalse(s.deleteMiddleNode(null));
    }

    @Test
    public void withLastNode() {
        assertFalse(s.deleteMiddleNode(LinkedListNode.of(1, 2, 3).next.next));
    }

    @Test
    public void withMiddleNode() {
        LinkedListNode input = LinkedListNode.of(1, 2, 3);
        assertTrue(s.deleteMiddleNode(input.next));
        assertEquals(LinkedListNode.of(1, 3), input);
    }
}
