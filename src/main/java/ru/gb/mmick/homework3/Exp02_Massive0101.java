package ru.gb.mmick.homework3;

public class Exp02_Massive0101 {
    public static void main(String[] args) {
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
