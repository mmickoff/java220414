package ru.gb.mmick.homework3;

import java.util.Arrays;

public class Exp81_offset1 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6};
        int[] array = shiftArray(ints, 3);
        System.out.println(Arrays.toString(array));
    }

    public static int[] shiftArray(int[] a, int offset) {
        offset %= a.length;
        if (offset > 0) {
            for (int i = a.length - 1; i >= offset; i--) {
                int c = a[i];
                a[i] = a[i - offset];
                a[i - offset] = c;
            }
        }
        return a;
    }
}

