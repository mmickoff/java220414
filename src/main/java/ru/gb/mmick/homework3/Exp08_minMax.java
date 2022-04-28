package ru.gb.mmick.homework3;

public class Exp08_minMax {
    public static void main(String[] args) {

        int[] array = { 8, 4, 6, 8, 4, 2, 7, 6, 9, 2, 4, 3, 6, 0 };
        int indexOfMin = 0;
        int indexOfMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[indexOfMin]) {
                indexOfMax = i;
            } else if (array[i] > array[indexOfMax]) {
                indexOfMin = i;
            }
        }
        System.out.println(indexOfMax + " " + indexOfMin);
    }
}
