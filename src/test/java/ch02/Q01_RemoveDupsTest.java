package ch02;

import org.junit.Test;
import util.LinkedListNode;

import static org.junit.Assert.*;

public class Q01_RemoveDupsTest {

    @Test
    public void deleteDupsTest() {
        LinkedListNode first = new LinkedListNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        LinkedListNode head = first;
        LinkedListNode second = first;
        for (int i = 1; i < 8; i++) {
            second = new LinkedListNode(i % 2, null, null);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }
        System.out.println(head.printForward());
        LinkedListNode cloneA = head.clone();
        LinkedListNode cloneB = head.clone();

        Q01_RemoveDups.deleteDupsA(cloneA);
        Q01_RemoveDups.deleteDupsB(cloneB);
        System.out.println(cloneA.printForward());
        System.out.println(cloneB.printForward());
    }
}