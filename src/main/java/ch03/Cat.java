package ch03;

public class Cat extends Animal {
  public Cat(String n) {
    super(n);
  }

  public String name() {
    return "Cat: " + name;
  }
}
