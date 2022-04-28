package ru.gb.mmick.homework3;

public class Exp04_massX6 {

    public static void main(String[] args) {
        massX6();
    }

    public static void massX6() {

        int[] b = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        {
            for (int i = 0; i < b.length; i++) {
                if (b[i] < 6) {
                    b[i] *= 6;
                }
                System.out.println(b[i]);
            }
        }
    }

}
