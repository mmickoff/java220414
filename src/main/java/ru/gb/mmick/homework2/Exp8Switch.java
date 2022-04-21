package ru.gb.mmick.homework2;

public class Exp8Switch {
    public static void main(String[] args) {
        int code = 6;
        System.out.println(getColorByCode(code));
    }

    public static String getColorByCode(int code) {
        switch (code) {

            case 1:
            return "Blue";
            case 2:
            return "Red";
            case 3:
            return "Gree";
            case 4:
            return "Yellow";
            default:
            return "Неизвестный код";
        }
    }
}
