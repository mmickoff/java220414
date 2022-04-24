package ru.gb.mmick.homework3;

public class Exp03_Massives03 {

    public static void main(String[] args) {
        massive100();
    }

    public static void massive100() {
        int[] b = new int[100];
        for (int i = 0; i < b.length; i++)
        {
            b[i] = i + 1;
            System.out.print(b[i] + ", ");
        }
    }
}
