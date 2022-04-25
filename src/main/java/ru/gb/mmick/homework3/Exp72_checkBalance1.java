package ru.gb.mmick.homework3;

public class Exp72_checkBalance1 {
    public static void main(String[] args) {
        checkBalance();
    }


    public static void checkBalance() {
        int[] k = {8, 44, 6, -11, 8, 2, -8, 6, 29, 30, 34, 3, 6, -9};
        int sum = 0;
        for (int p : k) {
            sum = p + sum;
        }
        System.out.println(sum);
    }
}
