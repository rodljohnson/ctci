package ch04;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q08_FindCommonAncestorTest {
  private Q08_FindCommonAncestor s = new Q08_FindCommonAncestor();

  @Test
  public void withOneNode() {
    ParentAwareBinaryTreeNode node = new ParentAwareBinaryTreeNode(1);
    assertEquals(node, s.findCommonAncestor(node, node));
  }

  @Test
  public void withTwoNodes() {
    ParentAwareBinaryTreeNode node = new ParentAwareBinaryTreeNode(1);
    node.addLeft(2);
    assertEquals(node, s.findCommonAncestor(node, node.left));
  }

  @Test
  public void withThreeNodes() {
    ParentAwareBinaryTreeNode node = new ParentAwareBinaryTreeNode(1);
    node.addLeft(2);
    node.addRight(3);
    assertEquals(node, s.findCommonAncestor(node.left, node.right));
  }

  @Test
  public void withMoreNodes() {
    ParentAwareBinaryTreeNode node = new ParentAwareBinaryTreeNode(1);
    node.addLeft(2);
    ParentAwareBinaryTreeNode ancestor = node.addRight(3);
    ParentAwareBinaryTreeNode a = ancestor.addLeft(4).addRight(5);
    ParentAwareBinaryTreeNode b = ancestor.addRight(6).addRight(7).addRight(8);
    assertEquals(ancestor, s.findCommonAncestor(a, b));
  }

}
