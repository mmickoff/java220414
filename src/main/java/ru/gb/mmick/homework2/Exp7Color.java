package ru.gb.mmick.homework2;

public class Exp7Color {
    public static void main(String[] args) {
        int code = 6;
        System.out.println(getColorByCode(code));
    }

    public static String getColorByCode(int code) {
        if (code == 1) {
            return  "Blue";
        } else if (code == 2) {
            return "Red";
        } else if (code == 3) {
            return "Gree";
        } else if (code == 4) {
            return "Yellow";
        } else {
            return "Неизвестный код";
        }

    }
}
