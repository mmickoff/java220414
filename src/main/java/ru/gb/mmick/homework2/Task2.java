package ru.gb.mmick.homework2;


public class Task2 {
    public static void main(String[] args) {
        System.out.println(within10and20(0, 12));
        number1();
        System.out.println(number2());
        String s = "Hello, world!"; // передаём значение ы в метод print1
        ptintWordN(s, 6);
        int y1 = 600;
        leapYear(y1);
        System.out.println(leapYear(y1));
    }

    public static boolean within10and20(int i, int i1) {
        int sum = i + i1;
        return (sum >= 10 && sum <= 20);
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
        return (y > 0);
    }

    public static void ptintWordN(String s, int n) { // создаём метод количества строк
        for (int i = 1; i < n; i++) { // считаем, сколько раз напечатать строку
            System.out.println(s); // печатаем строку
        }
    }
    public static boolean leapYear(int y1) {
        return (y1 % 4 == 0 & y1 % 100 != 0 | y1 % 400 == 0 );
    }
}
