package ru.gb.mmick.homework3;

public class Exp77_checkBalance_42 {
    public static void main(String[] args) {
        if (canBalance(new int[]{1, 2, 3, 5})) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }


    public static boolean canBalance(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        if (sum % 2 == 0) {
            return true; // System.out.println("true");
        } else {
            sum /= 2;
            for (int i = 0; i < a.length; i++) {
                sum -= a[i];
                if (sum == 0) {
                   return true;  // System.out.println("true");
                }

            }
           return false;   // System.out.println("false");
        }
    }
}


