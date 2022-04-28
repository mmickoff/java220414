package ru.gb.mmick.homework3;

public class Exp11_minMax {
    public static void main(String[] args) {
        int[] a = {8, 44, 6, 11, 4, 2, 8, 6, 29, 30, 34, 113, 6, 9};
        int max = 0;
        int min = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[max]) {
                max = i;
            } else if (a[i] < a[min]) {
                min = i;
            }
        }
        System.out.println(a[max] + "; " + a[min]);
    }
}
