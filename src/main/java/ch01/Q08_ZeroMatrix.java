package ch01;

import java.util.Arrays;

/**
 * Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are
 * set to 0.
 */
class Q08_ZeroMatrix {

  //O(mxn) runtime
  //O(1) space
  public int[][] zero(int[][] matrix) {
    if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
      return matrix;
    boolean isFirstRow = false;
    boolean isFirstCol = false;
    for(int j = 0;j < matrix.length;j++) {
      if(matrix[0][j] == 0) {
        isFirstRow = true;
        break;
      }
    }
    for (int i = 0;i < matrix[0].length;i++) {
      if(matrix[i][0] == 0) {
        isFirstCol = true;
        break;
      }
    }
    for(int i = 1;i < matrix.length;i++) {
      for (int j = 1; j < matrix[i].length; j++) {
        if(matrix[i][j] == 0) {
          matrix[0][j] = 0;
          matrix[i][0] = 0;
        }
      }
    }
    for(int i = 1;i < matrix.length;i++) {
      for (int j = 1; j < matrix[i].length; j++) {
        if(matrix[i][0] == 0 || matrix[0][j] == 0) {
          matrix[i][j] = 0;
        }
      }
    }
    if(isFirstRow) {
      for(int j = 0;j < matrix.length;j++) {
        matrix[0][j] = 0;
      }
    }
    if(isFirstCol) {
      for (int i = 0; i < matrix[0].length;i++) {
        matrix[i][0] = 0;
      }
    }
    return matrix;
  }

  //O(mxn) runtime
  //O(m + n) space
  /*public int[][] zero(int[][] matrix) {
    boolean[] rows = new boolean[matrix.length];
    boolean[] cols = new boolean[matrix[0].length];
    for(int i = 0;i < matrix.length;i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if(matrix[i][j] == 0) {
          rows[i] = true;
          cols[j] = true;
        }
      }
    }
    for(int i = 0;i < matrix.length;i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if(rows[i] || cols[j]) {
          matrix[i][j] = 0;
        }
      }
    }
    return matrix;
  }*/

  //O(mxn) runtime
  //O(mxn) space
  /*public int[][] zero(int[][] matrix) {
    int [][] copy = new int[matrix.length][matrix[0].length];
    for(int i = 0;i < matrix.length;i++) {
      copy[i] = Arrays.copyOf(matrix[i], matrix[i].length);
    }
    for(int i = 0;i < matrix.length;i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if(matrix[i][j] == 0) {
          for(int m = 0;m < matrix.length;m++) {
            copy[m][j] = 0;
          }
          for(int n = 0;n < matrix[i].length;n++) {
            copy[i][n] = 0;
          }
        }
      }
    }
    return copy;
  }*/

}
