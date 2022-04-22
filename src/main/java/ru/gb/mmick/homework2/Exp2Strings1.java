package ru.gb.mmick.homework2;

public class Exp2Strings1 {
    public static void main(String[] args) {
        ptintWordNTimes();
    }

    public static void ptintWordNTimes() {// создаём метод количества строк
        // при этом не получается вносить переменне  скобки - выдаёт ошибку
        String w = "Hello, world!"; // передаём значение ы в метод print1
        for (int i = 1; i < 6; i++) { // считаем, сколько раз напечатать строку
            System.out.println(w); // печатаем строку
        }
    }

}
