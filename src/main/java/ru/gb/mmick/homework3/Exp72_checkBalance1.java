package ru.gb.mmick.homework3;

public class Exp72_checkBalance1 {
    public static void main(String[] args) {
        if (checkBalance(new int[]{1, 2, 3, 6})) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    private static boolean checkBalance(int[] arr) {
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            if (leftSum == sumOfRightValuesInArray(i + 1, arr)) {
                return true;
            }
        }
        return false;
    }

    private static Integer sumOfRightValuesInArray(int startIndex, int[] arr) {
        int result = 0;
        for (int i = startIndex; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }
}