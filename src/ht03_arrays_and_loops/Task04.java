package ht03_arrays_and_loops;

import util.ArrayUtils;

public class Task04 {
    public static void main(String[] args) {
        int[] ints = ArrayUtils.fill(ArrayUtils.create(10));

        ArrayUtils.prn(ints);
        for (int i = 2; i < ints.length; i += 3) {
            ints[i] = 3;
        }
        ArrayUtils.prn(ints);
    }
}
