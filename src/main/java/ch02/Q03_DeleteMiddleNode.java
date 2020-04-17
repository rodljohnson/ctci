package ch02;

/**
 * Delete Middle Node: Implement an algorithm to delete a node in the middle(i.e., any node but the first and last node,
 * not necessarily the exact middle) of a singly linked list, given only access to that node.
 * EXAMPLE
 * Input: the node c from the linked list a->b->c->d->e->f
 * Result: nothing is returned, but the new linked list looks like a->b->d->e->f
 */
class Q03_DeleteMiddleNode {

  public void deleteMiddleNode(LinkedListNode n) {
    if(n.next == null) {
      return;
    }
    int val = n.next.val;
    n.val = val;
    n.next = n.next.next;
  }

}
