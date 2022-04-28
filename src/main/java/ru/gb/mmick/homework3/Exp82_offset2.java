package ru.gb.mmick.homework3;

import java.util.Arrays;

public class Exp82_offset2 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6};
        int[] array = shiftArray(ints, 4);
        System.out.println(Arrays.toString(array));
    }

    public static int[] shiftArray(int[] a, int offset) {
        // a.length;
        offset %= a.length;
        // int i = 0;
        for (int i = 0; i < a.length - 1; i++) {
            i = i + offset;
            // if (offset > 0) {
            // i = 0;
            if (i + offset > a.length - 1) {
                i += offset - a.length + 1;

            // i = 0;
        }else  {// (i + offset <= a.length -1)
                i += offset - 1;
            }
        }return a;
    }
}



