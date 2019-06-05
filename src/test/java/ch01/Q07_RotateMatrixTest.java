package ch01;

import org.junit.Test;
import util.AssortedMethods;

import static org.junit.Assert.*;

public class Q07_RotateMatrixTest {

    @Test
    public void rotateTest() {
        int[][] matrix = AssortedMethods.randomMatrix(3, 3, 0, 9);
        AssortedMethods.printMatrix(matrix);
        Q07_RotateMatrix.rotate(matrix);
        System.out.println();
        AssortedMethods.printMatrix(matrix);
    }

}