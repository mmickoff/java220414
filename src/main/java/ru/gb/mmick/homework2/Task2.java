package ru.gb.mmick.homework2;


public class Task2 {
    public static void main(String[] args) {
        within10and20();
        number1();
        number2();
        String s = "You!";
        pr("Hi, Mick!");
        pr(s);

    }

    public static boolean within10and20() {
        int i = 0;
        int i1 = 12;
        int sum = i + i1;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void number1() {
        int x = 5;
        if (x < 0) {
            System.out.println(x + " - число отрицательное");
        } else {
            System.out.println(x + " - число положительное");
        }
    }

    public static boolean number2() {
        int y = 5;
        if (y > 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void pr(String s) {
        System.out.println(s);
    }


}
