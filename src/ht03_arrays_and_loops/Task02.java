package ht03_arrays_and_loops;

import util.ArrayUtils;

public class Task02 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.create(10);
        int[] ints = ArrayUtils.fill(array);

        ArrayUtils.prn(ints);
        for (int i = 0; i < ints.length / 2; i++) {
            for (int j = i; j < ints.length / 2; j++) {
                if (ints[i] < ints[j]) {
                    int tmp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = tmp;
                }
            }
        }
        for (int i = ints.length / 2; i < ints.length; i++) {
            for (int j = i; j < ints.length; j++) {
                if (ints[i] > ints[j]) {
                    int tmp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = tmp;
                }
            }
        }
        ArrayUtils.prn(ints);
    }
}
