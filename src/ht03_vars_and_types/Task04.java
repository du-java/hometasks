package ht03_vars_and_types;

public class Task04 {
    public static void main(String[] args) {
        int i = 789;

        int n3 = i / 100;
        int n2_ = i % 100;
        int n2 = n2_ / 10;
        int n1 = i % 10;

        System.out.println(n1 + n2 + n3);
    }
}
