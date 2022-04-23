package ru.gb.mmick.homework3;

public class Exp01_Massives01 {
    public static void main(String[] args) {
        int[][] b = new int[3][4];
        b[2][0] = 3;
        b[0][1] = 4;
        for (int i = 0; i < b.length; i++) {
            System.out.print("b [" + i + "] - ");
            for (int j = 0; (j + 1) < b[i].length; j++) {
                System.out.print(b[i][j] + ", ");
            }
            for (int j = b[i].length - 1; (j + 1) == b[i].length; j++) {
                System.out.print(b[i][j] + "; ");
            }

            System.out.println();
        }

    }
}
