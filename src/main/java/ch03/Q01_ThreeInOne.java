package ch03;

/**
 * Describe how you could use a single array to implement three stacks
 */
class Q01_ThreeInOne {

  private int numberOfStacks = 3;
  private int stackCapacity;
  private int[] values;
  private int[] sizes;

  Q01_ThreeInOne(int initSize) {

  }

  void push(int stackNum, int val) {
    throw new UnsupportedOperationException();
  }

  int pop(int stackNum) {
    throw new UnsupportedOperationException();
  }

}
