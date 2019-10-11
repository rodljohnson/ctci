package ch08;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class Q11_CoinsTest {

  private final Q11_Coins s = new Q11_Coins();

  @Test
  public void withZeroCent() {
    assertEquals(1, s.makeChangeWithQuarterDimeNickelPenny(0));
  }

  @Test
  public void withOneCent() {
    assertEquals(1, s.makeChangeWithQuarterDimeNickelPenny(2));
  }

  @Test
  public void withTwoCents() {
    assertEquals(1, s.makeChangeWithQuarterDimeNickelPenny(3));
  }

  @Test
  public void with25Cents() {
    //25
    //10 10 5
    //10 10 1 1 1 1 1
    //10 5 5 5
    //10 5 5 1 1 1 1 1
    //10 5 1 1 1 1 1 1 1 1 1 1
    //10 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
    //5 5 5 5 5
    //5 5 5 5 1 1 1 1 1
    //5 5 5 1 1 1 1 1 1 1 1 1 1
    //5 5 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
    //5 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
    //1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
    assertEquals(13, s.makeChangeWithQuarterDimeNickelPenny(25));
  }

  @Test
  public void with100Cents() {
    assertEquals(242, s.makeChangeWithQuarterDimeNickelPenny(100));
  }

}
