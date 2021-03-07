package ht04_methods;

public class Task03 {
    public static void main(String[] args) {

        simple(5);
        simple(31);
        simple(8);

    }

    static void simple(int x) {
        for (int i = 2; i < x / 2; i++) {
            if (x % i == 0) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }

}
