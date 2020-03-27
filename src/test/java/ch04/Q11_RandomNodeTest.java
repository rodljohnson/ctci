package ch04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class Q11_RandomNodeTest {

  @Test
  void withSimpleCase() {
    Q11_RandomNode.Tree tree = new Q11_RandomNode.Tree();
    tree.insert(5);
    tree.insert(2);
    tree.insert(1);
    tree.insert(3);
    tree.insert(6);
    assertEquals(3, tree.find(3).getVal());
    assertNull(tree.find(4));
    assertNotNull(tree.getRandomNode());
  }

}
