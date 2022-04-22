package ru.gb.mmick.homework2;

public class Exp3Strings {

    public static void main(String[] args) {
        String s = "Hello, world!"; // передаём значение ы в метод print1
        ptintWordN(s, 6);
    }

    public static void ptintWordN(String s, int n) { // создаём метод количества строк
        for (int i = 1; i < n; i++) { // считаем, сколько раз напечатать строку
            System.out.println(s); // печатаем строку
        }
    }

}
