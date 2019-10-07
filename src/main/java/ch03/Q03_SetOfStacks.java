package ch03;

import java.util.ArrayList;
import java.util.Stack;

public class Q03_SetOfStacks {

  ArrayList<Stack> stacks = new ArrayList<Stack>();
  public int capacity;

  public Q03_SetOfStacks(int capacity) {
    this.capacity = capacity;
  }

  public void push(int v) {
    throw new UnsupportedOperationException();
  }

  public int pop() {
    throw new UnsupportedOperationException();
  }

  public int popAt(int index) {
    throw new UnsupportedOperationException();
  }

  public int leftShift(int index, boolean removeTop) {
    throw new UnsupportedOperationException();
  }

  public boolean isEmpty() {
    throw new UnsupportedOperationException();
  }

}
