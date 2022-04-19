package ru.gb.mmick.homework1;

public class Task1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange\n"
                + "Banana\n"
                + "Apple"); }

    public static void checkSumSign() {
        int a = 4;
        int b = - 10;
        if ((a + b) > 0) {
            System.out.println("Сумма чисел положительна");
        } else if ((a + b) < 0) {
            System.out.println("Сумма чисел отрицательна");
        } else {
            System.out.println("Сумма чисел равна нулю");
        }
    }

    public static void printColor() {
        int value = 5;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value < 100) {
            System.out.println("Жёлтый");
        } else  {
            System.out.println("Зелёный");
        }
    }


    public static void compareNumbers() {
        int a = 4;
        int b = - 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else
            System.out.println("a < b"); }
}