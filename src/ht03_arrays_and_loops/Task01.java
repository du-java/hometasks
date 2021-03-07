package ht03_arrays_and_loops;

import util.ArrayUtils;

public class Task01 {

    public static void main(String[] args) {
        int[] array = ArrayUtils.fill(ArrayUtils.create(10));
        ArrayUtils.prn(array);
        int[] array9 = ArrayUtils.create(9);
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == 4) continue;
            array9[j] = array[i];
            j++;
        }
        ArrayUtils.prn(array9);
    }
}
