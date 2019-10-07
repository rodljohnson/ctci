package ch03;

import java.util.Stack;
import org.junit.Test;
import util.AssortedMethods;

public class Q05_SortStackTest {

  @Test
  public void sortStackTest() {
    Stack<Integer> s = new Stack<Integer>();
    for (int i = 0; i < 10; i++) {
      int r = AssortedMethods.randomIntInRange(0,  1000);
      s.push(r);
    }

    Q05_SortStack.sort(s);

    while(!s.isEmpty()) {
      System.out.println(s.pop());
    }
  }

}
