package util;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtils {

    private final static Random RANDOM = new Random();

    public static void prn(int[] ints) {
        System.out.printf("%s\n", Arrays.toString(ints));
    }

    public static void prn(int[][] matrix) {
        for (int[] array : matrix) {
            System.out.println(Arrays.toString(array));
        }
    }

    public static int[] fill(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = RANDOM.nextInt(10);
        }
        return ints;
    }

    public static int[] create(int size) {
        return new int[size];
    }

    public static int[][] create(int row, int col) {
        return new int[row][col];
    }

    public static int[][] fill(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = fill(matrix[i]);
        }
        return matrix;
    }
}
