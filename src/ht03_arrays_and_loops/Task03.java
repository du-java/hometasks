package ht03_arrays_and_loops;

import util.ArrayUtils;

public class Task03 {
    public static void main(String[] args) {
        int[] ints = ArrayUtils.fill(ArrayUtils.create(10));

        ArrayUtils.prn(ints);
        for (int i = 0; i < ints.length; i++) {
            ints[i] = ints[i] % 2 == 0 ? 0 : 1;
        }
        ArrayUtils.prn(ints);
    }
}
