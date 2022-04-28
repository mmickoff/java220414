package ru.gb.mmick.homework3;

import java.util.Arrays;

public class Exp03_02_010101 {
    public static void main(String[] args) {
        inverseArray(new int[]{0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0});
        int[][] ints = fillDiagArray(5);
        System.out.println(Arrays.deepToString(ints));
    }

    public static void inverseArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (a[i] == 0 ? 1 : 0);
        }
        String s = Arrays.toString(a); // печать в консоль
        System.out.println(s);
    }

    public static int[] fillArray() {
        int[] b = new int[100];
        for (int i = 1; i < b.length; i++) {
            b[i] = i + 1;
        }
        return b;
    }

    public static int[][] fillDiagArray(int n) {
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = (0);
                }
            }
        }
        return a;
    }

    public static void checkBalanse (int[] a) {

    }

}
