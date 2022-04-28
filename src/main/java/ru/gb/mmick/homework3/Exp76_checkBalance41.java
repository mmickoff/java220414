package ru.gb.mmick.homework3;

public class Exp76_checkBalance41 {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 6};
        int lSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rSum = 0;
            lSum += arr[i];
            for (int j = i; j < args.length; j--) {
                rSum += arr[j];
            }
            if (lSum == rSum) {
                System.out.println("true");
            }
        }
        System.out.println("false");
    }
}

