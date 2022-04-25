package ru.gb.mmick.homework3;

import java.util.Arrays;

public class Exp9_minMax {

    static int max = 0;
    private static int a[] = { 8, 44, 6, 8, -34, 2, 7, 6, 9, 2, 4, 3, 6, 0 };

    public static void main(String[] args) {
        fMax(a);
        fMin(a);
    }

    public static void fMax(int[] a) {
        Arrays.sort(a);
        max = a[a.length - 1];
        System.out.println(max); // "%4d",
    }

    public static void fMin(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < a[0]) {
                min = a[i];
            }
        }
        System.out.println(min); // "%4d",
    }

    public static void findIndexOfMax() {
        //код метода, который находит и возвращает индексы
        // максимального и минимального элементов массива
    }
}