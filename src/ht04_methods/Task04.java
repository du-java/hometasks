package ht04_methods;

public class Task04 {

    static int counter = 0;

    public static void main(String[] args) {

        func();
        func();
        func();
        func();

        System.out.println(counter);
    }

    private static void func() {
        counter++;
    }

}
