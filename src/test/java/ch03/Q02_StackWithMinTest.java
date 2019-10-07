package ch03;

import org.junit.Test;

public class Q02_StackWithMinTest {

  @Test
  public void stackWithMinTest() {
    Q02_StackWithMin stack = new Q02_StackWithMin();
    Q02_StackWithMin2 stack2 = new Q02_StackWithMin2();
    int[] array = {2, 1, 3, 1};
    for (int value : array) {
      stack.push(value);
      stack2.push(value);
      System.out.print(value + ", ");
    }
    System.out.println('\n');
    for (int i = 0; i < array.length; i++) {
      System.out.println("Popped " + stack.pop().value + ", " + stack2.pop());
      System.out.println("New min is " + stack.min() + ", " + stack2.min());
    }
  }
}
