package ru.gb.mmick.homework3;

public class Exp05 {
    public static void main(String[] args) {
        int [ ] [ ] c = new int[3][];
        c[0] = new int[2];
        c[1] = new int[10];
        c[2] = new int[5];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + ", ");
            }
            System.out.println();
        }

    }
}
