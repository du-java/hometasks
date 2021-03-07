package ht04_methods;

public class Task02 {
    public static void main(String[] args) {

        prb(5);
        prb(8);

    }

    static void prb(int x) {
        for (int i = 1; i < x + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
        }
        System.out.println();
    }

}
