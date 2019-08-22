package ch03;

public class Q01_FixedMultiStack {

  private int numberOfStacks = 3;
  private int stackCapacity;
  private int[] values;
  private int[] sizes;

  public Q01_FixedMultiStack(int stackSize) {
    stackCapacity = stackSize;
    values = new int[stackSize * numberOfStacks];
    sizes = new int[numberOfStacks];
  }

  public void push(int stackNum, int value) throws FullStackException {
    throw new UnsupportedOperationException();
  }

  public int pop(int stackNum) {
    throw new UnsupportedOperationException();
  }

  public int peek(int stackNum) {
    throw new UnsupportedOperationException();
  }

  public boolean isEmpty(int stackNum) {
    throw new UnsupportedOperationException();
  }

  public boolean isFull(int stackNum) {
    throw new UnsupportedOperationException();
  }

  public int[] getValues() {
    return values;
  }

  }
