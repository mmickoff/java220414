package ru.gb.mmick.homework3;

import java.util.Arrays;

public class Exp73_checkBalance2 {
    public static void main(String[] args) {
        checkBalance();
    }

    public static void checkBalance() {
        int[] k = {8, 44, 6, -11, 8, 2, -8, 6, 29, 30, 34, 3, 6, -9};
        int sum = 0;
        for (int i = 0; i < k.length; i++) {
            sum = sum + k[i];
        }
        if (sum % 2 == 0) {
            int sum2 = 0;
            for (int i = 0; i < k.length; i++) {
                while (sum2 <= sum / 2) {
                    sum2 = sum2 + k[i];
                }
            }
            String h = Arrays.toString(k); // печать в консоль
            System.out.println("true" + k);

        }
    }
}
