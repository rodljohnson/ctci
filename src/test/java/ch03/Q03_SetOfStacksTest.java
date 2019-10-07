package ch03;

import org.junit.Test;


public class Q03_SetOfStacksTest {

  @Test
  public void setOfStacksTest() {
    int capacity_per_substack = 5;
    Q03_SetOfStacks set = new Q03_SetOfStacks(capacity_per_substack);
    for (int i = 0; i < 34; i++) {
      set.push(i);
    }
    for (int i = 0; i < 35; i++) {
      System.out.println("Popped " + set.pop());
    }
  }

}
