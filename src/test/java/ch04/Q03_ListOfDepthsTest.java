package ch04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;

class Q03_ListOfDepthsTest {

  private Q03_ListOfDepths s = new Q03_ListOfDepths();

  @Test
  void withOneElement() {
    List<LinkedList<Integer>> linkedLists = s.create(new BinaryTreeNode(1));
    List<LinkedList<Integer>> results = new ArrayList<>();
    results.add(new LinkedList<>(Collections.singletonList(1)));
    assertEquals(results, linkedLists);
  }

  @Test
  void withTwoElements() {
    BinaryTreeNode node = new BinaryTreeNode(1);
    node.left = new BinaryTreeNode(2);
    List<LinkedList<Integer>> linkedLists = s.create(node);
    List<LinkedList<Integer>> results = new ArrayList<>();
    results.add(new LinkedList<>(Collections.singletonList(1)));
    results.add(new LinkedList<>(Collections.singletonList(2)));
    assertEquals(results, linkedLists);
  }

  @Test
  void withThreeElements() {
    BinaryTreeNode node = new BinaryTreeNode(1);
    node.left = new BinaryTreeNode(2);
    node.right = new BinaryTreeNode(3);
    List<LinkedList<Integer>> linkedLists = s.create(node);
    List<LinkedList<Integer>> results = new ArrayList<>();
    results.add(new LinkedList<>(Collections.singletonList(1)));
    results.add(new LinkedList<>(Arrays.asList(2, 3)));
    assertEquals(results, linkedLists);
  }

}
