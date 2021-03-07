package ht03_arrays_and_loops;

import util.ArrayUtils;

public class Task07 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.fill(ArrayUtils.create(10));

        int[] ints = ArrayUtils.create(10);

        System.out.println("original rnd array");
        ArrayUtils.prn(array);

        for (int i = 0; i < array.length; i++) {
            int index = array[i];
            if (ints[index] == 0) {
                ints[index] = 1;
            } else {
                array[i] = -1;
            }
        }

        System.out.println("remove duplicates");
        ArrayUtils.prn(ints);
        ArrayUtils.prn(array);

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) continue;

            for (; index < ints.length; index++) {
                if (ints[index] == 1) continue;
                array[i] = index;
                break;
            }
        }
        System.out.println("fill array");
        ArrayUtils.prn(ints);
        ArrayUtils.prn(array);
    }

}
