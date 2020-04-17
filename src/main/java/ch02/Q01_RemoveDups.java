package ch02;

import java.util.HashSet;
import java.util.Set;

/**
 * Remove Dups: Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 */
class Q01_RemoveDups {

  //O(n^2) runtime
  //O(1) space
  public LinkedListNode deleteDups(LinkedListNode head) {
    if(head == null || head.next == null) {
      return head;
    }
    LinkedListNode cur = head;
    while(cur != null) {
      LinkedListNode temp = cur;
      while(temp != null && temp.next != null) {
        if(temp.next.val == cur.val) {
          temp.next = temp.next.next;
        }
        temp = temp.next;
      }
      cur = cur.next;
    }
    return head;
  }

  //O(n) runtime
  //O(n) space
  /*public LinkedListNode deleteDups(LinkedListNode head) {
    if(head == null || head.next == null) {
      return head;
    }
    Set<Integer> set = new HashSet<>();
    LinkedListNode cur = head;
    while(cur != null && cur.next != null) {
      set.add(cur.val);
      if(set.contains(cur.next.val)) {
        cur.next = cur.next.next;
      }
      cur = cur.next;
    }
    return head;
  }*/

}
