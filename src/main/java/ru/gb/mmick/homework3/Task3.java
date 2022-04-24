package ru.gb.mmick.homework3;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        massive01();
        System.out.println();
        massive100();
        System.out.println();
        massX6();
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


    public static void massive100() {
        int[] b = new int[100];
        for (int i = 0; i < b.length; i++)
        {
            b[i] = i + 1;
        }
        String s = Arrays.toString(b);
        System.out.println(s);
    }


    public static void massX6() {
        int[] b = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        {
            for (int i = 0; i < b.length; i++) {
                if (b[i] < 6) {
                    b[i] *= 6;
                }
            }
        }
        String s = Arrays.toString(b);
        System.out.println(s);
    }



}
