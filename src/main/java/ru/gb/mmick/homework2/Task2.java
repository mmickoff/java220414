package ru.gb.mmick.homework2;

import java.sql.SQLOutput;

public class Task2 {
    public static void main(String[] args) {

        summa1();
        value1();
        String a = "You!";
        pr("Hi, Mick!");
        pr(a);

    }

    public static void summa1() {
        int a = 0;
        int b = 12;
        if (a + b >= 10 && a + b <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void pr(String b) {
        System.out.println(b);
    }

    public static int value1(int x) {
        int x = 5;
        if (x < 0) {
            System.out.println(x + " - число отрицательное");
        } else {
            System.out.println(x + " - число положительное");
        }
    }
}
