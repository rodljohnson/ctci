package ch04;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

class Q11_RandomNodeTest {

  @Test
  public void withSimpleCase() {
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
