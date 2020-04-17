package ch02;

/**
 * Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.
 */
class Q02_ReturnKthToLast {

  //iterative
  public LinkedListNode kthToLast(LinkedListNode head, int k) {
    LinkedListNode l1 = head;
    for(int i = 0;i <= k;i++) {
      if(l1 == null)
        return null;
      l1 = l1.next;
    }
    LinkedListNode l2 = head;
    while(l1 != null) {
      l1 = l1.next;
      l2 = l2.next;
    }
    return l2;
  }

  //recursive
  /*public LinkedListNode kthToLast(LinkedListNode head, int k) {
    return helper(head, k, new int[]{-1});
  }

  private LinkedListNode helper(LinkedListNode head, int k, int[] index) {
    if(head == null) {
      return null;
    }
    LinkedListNode res = helper(head.next, k, index);
    index[0] = index[0] + 1;
    if(index[0] == k) {
      return head;
    }
    return res;
  }*/

}
