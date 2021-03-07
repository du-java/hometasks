package ht03_arrays_and_loops;

import util.ArrayUtils;

public class Task06 {
    public static void main(String[] args) {
        int[][] matrix = ArrayUtils.fill(ArrayUtils.create(5, 5));

        ArrayUtils.prn(matrix);
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i == j) matrix[i][j] = 0;
                if(j > i) matrix[i][j] = -1;
                if(j < i) matrix[i][j] = 1;
            }
        }
        ArrayUtils.prn(matrix);
    }
}
