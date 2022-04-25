package ru.gb.mmick.homework3;

import java.util.Arrays;
import java.util.Random;
import static java.lang.Math.abs;

public class Exp74_chekBalance33 {
    public static void main(String[] args) {
        reverseNumbersInArray();
        fillNumbersInArray();
        doubleValuesInArrayWhichLess6();
        int [][] arr = drawXInArray(10, 10);
        for (int[] element: arr) {
            System.out.println(Arrays.toString(element));
        }
        System.out.println(Arrays.toString(initArray(20, 50)));
        findMinMaxValuesInArray();
        if (checkBalance(new int[]{1, 2, 3, 5})) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println(Arrays.toString(shiftValuesInArray(new int[] {1,2,3,4,5,6,7,8,9}, -9)));
    }

    private static int[] initRandomArray(int maxLength, int maxValue) {
        int[] arr = new int[maxLength];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(maxValue + 1);
        }
        return arr;
    }

    private static void reverseNumbersInArray() {
        int[] arr = initRandomArray(10, 1);
        System.out.println("Начальный массив - " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 1 ? 0 : 1;
        }
        System.out.println("Обновленный массив - " + Arrays.toString(arr));
    }

    private static void fillNumbersInArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println("Значения массива - " + Arrays.toString(arr));
    }

    private static void doubleValuesInArrayWhichLess6() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] < 6 ? arr[i] * 2 : arr[i];
        }
        System.out.println("Значения массива - " + Arrays.toString(arr));
    }

    private static int[][] drawXInArray(int x, int y) {
        int[][] arr = new int[x][y];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else if (i == arr.length - j - 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }

    private static int[] initArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }

    private static void findMinMaxValuesInArray() {
        int[] arr = initRandomArray(10, 20);
        int minValue = arr[0];
        int maxValue = arr[0];
        for (int curVal : arr) {
            if (minValue > curVal) {
                minValue = curVal;
            }
            if (maxValue < curVal) {
                maxValue = curVal;
            }
        }
        System.out.println("Значения массива - " + Arrays.toString(arr));
        System.out.println("Минимальное значение - " + minValue);
        System.out.println("Максимальное значение - " + maxValue);
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

    private static int[] shiftValuesInArray(int[] arr, int shiftNumber) {
        int currentValue;
        int previousValue = 0;
        for (int i = 0; i < abs(shiftNumber); i++) {
            for (int j = 0; j < arr.length; j++) {
                currentValue = arr[getCurrentIndexOfArray(j, shiftNumber, arr.length)];
                arr[getCurrentIndexOfArray(j, shiftNumber, arr.length)] = previousValue;
                previousValue = currentValue;
            }
            arr[0] = previousValue;
        }
        return arr;
    }

    private static int getCurrentIndexOfArray(int j, int shiftNumber, int arrayLength) {
        if (j > 0 && shiftNumber < 0) {
            return arrayLength - j;
        }
        return j;
    }

    private static Integer sumOfRightValuesInArray(int startIndex, int[] arr) {
        int result = 0;
        for (int i = startIndex; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }
}