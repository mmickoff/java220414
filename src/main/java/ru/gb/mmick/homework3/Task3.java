package ru.gb.mmick.homework3;

public class Task3 {
    public static void main(String[] args) {
        massive01();
    }


    public static void massive01() {
        int[] a = new int[10];
        System.out.print("a[10] - { ");
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                System.out.print(" 1");
            } else {
                System.out.print(" 0");
            }
            if (i < a.length - 1) {
                System.out.print(", ");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" }");
    }
}
