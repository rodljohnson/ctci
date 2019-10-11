package ch08;

import static org.junit.Assert.assertEquals;

import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;

class Q12_EightQueensTest {

  private final Q12_EightQueens s = new Q12_EightQueens();

  @Test
  public void withEightQueens() {
    List<List<Point>> result = s.arrange();
    System.out.println("Solution size " + result.size());
    result.stream()
        .map(points -> points.stream().map(this::replace).collect(Collectors.joining()))
        .forEach(System.out::println);
    assertEquals(92, result.size());
  }

  private String replace(Point p) {
    char[] chars = " 0 0 0 0 0 0 0 0\n".toCharArray();
    chars[p.y * 2 + 1] = 'x';
    return String.valueOf(chars);
  }

}
