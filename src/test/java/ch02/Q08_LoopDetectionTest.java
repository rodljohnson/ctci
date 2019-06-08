package ch02;

import org.junit.Test;
import util.LinkedListNode;

import static org.junit.Assert.*;

public class Q08_LoopDetectionTest {

    @Test
    public void findBeginningTest() {
        int list_length = 100;
        int k = 10;

        // Create linked list
        LinkedListNode[] nodes = new LinkedListNode[list_length];
        for (int i = 0; i < list_length; i++) {
            nodes[i] = new LinkedListNode(i, null, i > 0 ? nodes[i - 1] : null);
        }

        // Create loop;
        nodes[list_length - 1].next = nodes[list_length - k];

        LinkedListNode loopA = Q08_LoopDetection.findBeginningA(nodes[0]);
        if (loopA == null) {
            System.out.println("No Cycle.");
        } else {
            System.out.println(loopA.data);
        }
        LinkedListNode loopB = Q08_LoopDetection.findBeginningB(nodes[0]);
        if (loopB == null) {
            System.out.println("No Cycle.");
        } else {
            System.out.println(loopB.data);
        }
    }
}