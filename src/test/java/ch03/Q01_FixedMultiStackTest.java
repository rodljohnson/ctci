package ch03;

import org.junit.Test;
import util.AssortedMethods;

public class Q01_FixedMultiStackTest {

  @Test
  public void fixedMultiStackTest() throws Exception {
    Q01_FixedMultiStack stacks = new Q01_FixedMultiStack(4);
    printStacks(stacks);
    stacks.push(0, 10);
    printStacks(stacks);
    stacks.push(1, 20);
    printStacks(stacks);
    stacks.push(2, 30);
    printStacks(stacks);

    stacks.push(1, 21);
    printStacks(stacks);
    stacks.push(0, 11);
    printStacks(stacks);
    stacks.push(0, 12);
    printStacks(stacks);

    stacks.pop(0);
    printStacks(stacks);

    stacks.push(2, 31);
    printStacks(stacks);

    stacks.push(0, 13);
    printStacks(stacks);
    stacks.push(1, 22);
    printStacks(stacks);

    stacks.push(2, 31);
    printStacks(stacks);
    stacks.push(2, 32);
    printStacks(stacks);
  }

  public void printStacks(Q01_FixedMultiStack stacks) {
    System.out.println(AssortedMethods.arrayToString(stacks.getValues()));
  }

}
