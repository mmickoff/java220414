package ru.gb.mmick.homework3;

public class Exp10_minMax {

    public static void main(String[] args) {
        finMax(z);
        finMin(z);
    }

    public static int z[] = {8, 44, 6, -11, 4, 72, -8, 6, -29, 30, 34, 3, 6, -9};

    public static void finMax(int[] z) {
        int max = z[0];
        for (int i = 0; i < z.length; i++) {
            if (z[i] > max) {
                max = z[i];
            }
        }
        System.out.println("Максимальное значение массива = " + max + ".");
    }

    public static void finMin(int[] z
    ) {
        int min = z[0];
        for (int i = 0; i < z.length; i++) {
            if (z[i] < min) {
                min = z[i];
            }
        }
        System.out.println("Миниимальное значение массива = " + min + ".");
    }

}