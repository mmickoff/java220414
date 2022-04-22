package ru.gb.mmick.homework2;

public class Exp5leapYear {
    public static void main(String[] args) {
       int y1 = 600;
        leapYear(y1);
        System.out.println(leapYear(y1));
    }

    public static boolean leapYear(int y1) {
        return (y1 % 4 == 0 & y1 % 100 != 0 | y1 % 400 == 0 );
    }
}

