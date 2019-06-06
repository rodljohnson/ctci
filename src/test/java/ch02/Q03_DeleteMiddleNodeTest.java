package ch02;

import org.junit.Test;
import util.AssortedMethods;
import util.LinkedListNode;

import static org.junit.Assert.*;

public class Q03_DeleteMiddleNodeTest {

    @Test
    public void deleteNodeTest() {
        LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
        System.out.println(head.printForward());
        Q03_DeleteMiddleNode.deleteNode(head.next.next.next.next); // delete node 4
        System.out.println(head.printForward());
    }
}