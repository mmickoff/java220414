package ru.gb.mmick.homework2;

public class Exp1Summ {
    public static void main(String[] args) {

        within10and20(0, 12);
    }

    public static boolean within10and20(int i, int i1) { // создаём метод расчёта пределов суммы
        // при этом не получается вносить переменне  скобки - выдаёт ошибку
                int sum = i + i1;
        return (sum >= 10 && sum <= 20);
        }
}

