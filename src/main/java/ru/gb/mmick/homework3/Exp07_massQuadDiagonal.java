package ru.gb.mmick.homework3;

import java.util.Scanner;

public class Exp07_massQuadDiagonal {
    public static void main(String[] args) {
        massQuadDiagonal();
    }

    public static void massQuadDiagonal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину стороны равностороннего массива: ");
        int leng = sc.nextInt();
        int i = leng;
        int j = i;
        int[][] a = new int[i][j]; // задаём массив
        for (i = 0; i < leng; i++) { // прохродим в начало строки
            System.out.println(); // переходим на сл.строку
            for (j = 0; j < leng; j++) { // проходим вдоль строк(и)
                if (i == j || (leng - 1 - i) == j) { // просчитываем, яч.для единиц
                    System.out.print("  1");
                } else {
                    System.out.printf( "  *"); //  "%2d", a[i][j]

                }

            }
        }
    }
}



