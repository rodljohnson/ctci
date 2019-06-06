package ch02;

import org.junit.Test;
import util.AssortedMethods;
import util.LinkedListNode;

import static org.junit.Assert.*;

public class Q02_ReturnKthToLastTest {

    @Test
    public void printKthToLast() {
        int[] array = {0, 1, 2, 3, 4, 5, 6};
        LinkedListNode head = AssortedMethods.createLinkedListFromArray(array);
        System.out.println(head.printForward());
        for (int k = 1; k <= array.length; k++) {
            int data = Q02_ReturnKthToLast.printKthToLastA(head, k);
            System.out.println(k + "th to last node is " + data);
        }
        System.out.println();
        for (int k = 1; k <= array.length; k++) {
            int data = Q02_ReturnKthToLast.printKthToLastB(head, k);
            System.out.println(k + "th to last node is " + data);
        }
    }
}