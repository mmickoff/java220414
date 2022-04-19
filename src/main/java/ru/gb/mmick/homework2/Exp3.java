package ru.gb.mmick.homework2;

public class Exp3 {

    public static void main(String[] args) {
        lines1();
    }


    public static void lines1() { // создаём метод масиива строк
        for (int i = 1; i < 6; i++) { // считаем, сколько раз напечатать строку
            String s = "Hello, world!"; // передаём значение ы в метод print1
            System.out.println(s); // печатаем строку
        }
    }

}
