package ru.gb.mmick.homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Exp06_InVal {
    public static void main(String[] args) {
        initValue();
    }

    private static void initValue() {
        Scanner sc = new Scanner(System.in); // создали сканер
        System.out.print("Введите длину массива: ");
        int len = sc.nextInt();
        System.out.print("Введите значение ячейки: ");
        int initialValue = sc.nextInt();
        int i = len;
        int[] d = new int[i];
        for (i = 0; i < len; i++) {
            d[i] = initialValue;
        }
        String s = Arrays.toString(d);
        System.out.println(s);

    }
}
