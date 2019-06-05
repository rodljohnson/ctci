package ch01;

import org.junit.BeforeClass;
import org.junit.Test;
import util.AssortedMethods;

public class Q08_ZeroMatrixTest {

    public static int[][] matrix;

    @BeforeClass
    public static void init() {
        int nrows = 4;
        int ncols = 4;
        matrix = AssortedMethods.randomMatrix(nrows, ncols, -10, 10);
        AssortedMethods.printMatrix(matrix);
    }

    @Test
    public void  setZerosATest() {
        int[][] clone = cloneMatrix(matrix);
        Q08_ZeroMatrix.setZerosA(clone);

        System.out.println();

        AssortedMethods.printMatrix(clone);

        System.out.println();
    }

    @Test
    public void  setZerosBTest() {
        int[][] clone = cloneMatrix(matrix);
        Q08_ZeroMatrix.setZerosB(clone);

        System.out.println();

        AssortedMethods.printMatrix(clone);

        System.out.println();
    }

    @Test
    public void  setZerosCTest() {
        int[][] clone = cloneMatrix(matrix);
        Q08_ZeroMatrix.setZerosC(clone);

        System.out.println();

        AssortedMethods.printMatrix(clone);
    }

    public static int[][] cloneMatrix(int[][] matrix) {
        int[][] c = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                c[i][j] = matrix[i][j];
            }
        }
        return c;
    }

}