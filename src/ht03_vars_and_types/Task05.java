package ht03_vars_and_types;

public class Task05 {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c = 5;

        int max = -1;
        int mid = -1;
        int min = -1;

        if (a > b) {
            if (a > c) {
                max = a;
                if (b > c) {
                    mid = b;
                    min = c;
                } else {
                    mid = c;
                    min = b;
                }
            }
        } else if (b > c) {
            max = b;
            if (a > c) {
                mid = a;
                min = c;
            } else {
                mid = c;
                min = a;
            }
        } else {
            max = c;
            mid = b;
            min = a;
        }

        System.out.printf("a= %d, b= %d, c= %d", min, mid, max);
    }
}
