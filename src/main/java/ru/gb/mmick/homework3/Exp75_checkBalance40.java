package ru.gb.mmick.homework3;

public class Exp75_checkBalance40 {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 6};
        int lSum = 0;
        for (int i = 0; i < arr.length; i++) {
            lSum += arr[i];
            int rSum = 0;
            for (int j = i; j < arr.length; j++) {
                rSum += arr[j];
            }
            if (lSum == rSum) {
                System.out.println("true");

            }
        }
        System.out.println("false");

    }
}

