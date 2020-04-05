package ch01;

/**
 * Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a
 * method to rotate the image by 90 degrees. Can you do this in place?
 */
class Q07_RotateMatrix {

  public int[][] rotate(int[][] matrix) {
    int n = matrix.length;
    for(int i = 0;i < n / 2;i++) {
      for(int j = i;j < n - i - 1;j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[n - 1 - j][i];
        matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
        matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
        matrix[j][n - 1 - i] = temp;
      }
    }
    return matrix;
  }

}
