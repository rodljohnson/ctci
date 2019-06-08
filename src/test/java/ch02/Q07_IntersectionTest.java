package ch02;

import org.junit.Test;
import util.AssortedMethods;
import util.LinkedListNode;

import static org.junit.Assert.*;

public class Q07_IntersectionTest {

    @Test
    public void findIntersectionTest() {
        /* Create linked list */
        int[] vals = {-1, -2, 0, 1, 2, 3, 4, 5, 6, 7, 8};
        LinkedListNode list1 = AssortedMethods.createLinkedListFromArray(vals);

        int[] vals2 = {12, 14, 15};
        LinkedListNode list2 = AssortedMethods.createLinkedListFromArray(vals2);

        list2.next.next = list1.next.next.next.next;

        System.out.println(list1.printForward());
        System.out.println(list2.printForward());


        LinkedListNode intersection = Q07_Intersection.findIntersection(list1, list2);

        System.out.println(intersection.printForward());
    }
}