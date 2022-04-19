package ru.gb.mmick.homework2;

public class Exp1 {
    public static void main(String[] args) {

        within10and20();
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
}
