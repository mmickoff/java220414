package ru.gb.mmick.homework3;

import java.util.Arrays;

public class Exp73_checkBalance2 {
    public static void main(String[] args) {
        checkBalance();
    }

    public static void checkBalance() { //
        int[] k = {2, 5, 4, 4, 7, 8};
        int sum = 0;
        for (int i = 0; i < k.length; i++) {
            sum = sum + k[i];
        }
        if (sum % 2 == 0) {
            int leftSum = 0;
            for (int i = 0; i < k.length; i++);
                if (leftSum == sum / 2) {
                }
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }
    // System.out.println("Good"); // return true;


