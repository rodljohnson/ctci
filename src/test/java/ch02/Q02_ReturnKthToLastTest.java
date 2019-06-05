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
        for (int i = 0; i <= array.length + 1; i++) {
            Q02_ReturnKthToLast.printKthToLast(head, i);
        }
    }
}