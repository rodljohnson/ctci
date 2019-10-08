package ch04;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q02_MinimalTreeTest {

  private Q02_MinimalTree s = new Q02_MinimalTree();

  @Test
  public void withOneElement() {
    BinaryTreeNode binaryTreeNode = s.buildMinimalTree(new int[]{1});
    assertEquals(1, binaryTreeNode.val);
    assertNull(binaryTreeNode.left);
    assertNull(binaryTreeNode.right);
  }

  @Test
  public void withTwoElements() {
    BinaryTreeNode binaryTreeNode = s.buildMinimalTree(new int[]{1, 2});
    assertEquals(1, binaryTreeNode.val);
    assertEquals(2, binaryTreeNode.right.val);
    assertEquals(null, binaryTreeNode.left);
  }

  @Test
  public void withThreeElements() {
    BinaryTreeNode binaryTreeNode = s.buildMinimalTree(new int[]{1, 2, 3});
    assertEquals(2, binaryTreeNode.val);
    assertEquals(1, binaryTreeNode.left.val);
    assertEquals(3, binaryTreeNode.right.val);
  }

  @Test
  public void withFourElements() {
    BinaryTreeNode binaryTreeNode = s.buildMinimalTree(new int[]{1, 2, 3, 4});
    assertEquals(2, binaryTreeNode.val);
    assertEquals(1, binaryTreeNode.left.val);
    assertEquals(3, binaryTreeNode.right.val);
    assertEquals(4, binaryTreeNode.right.right.val);
  }

}
