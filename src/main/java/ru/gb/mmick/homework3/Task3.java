package ru.gb.mmick.homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        massive01();
        massive100();
        massX6();
        initValue();
        massQuadDiagonal();
    }

    // задача 1
    public static void massive01() {
        int[] a = new int[10];  // создаём пустой массив
        System.out.print("a[10] - ");  // ставим в начало наименование массива
        for (int i = 0; i < a.length; i++) {  // проходим по массиву циклом
            if (i % 2 == 0) {  // определяем чётны ячейки
                a[i] = 1;  // присваиваем им 1
            } else {  // определяем нечётны ячейки
                a[i] = 0;  // присваиваем им 0
            }
        }
        String s = Arrays.toString(a); // печать в консоль
        System.out.println(s);
    }

    // задача 2
    public static void massive100() {
        int[] b = new int[100];  // создаём пустой массив на 100яч.
        for (int i = 0; i < b.length; i++) {  // проходим по массиву
            b[i] = i + 1;  // присваиваем ячейкам значения
        }
        String s = Arrays.toString(b); // печать в консоль
        System.out.println(s);
    }

    // задача 3
    public static void massX6() {
        int[] b = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};  // определяем массив
        {
            for (int i = 0; i < b.length; i++) {  // проходим циклом по массиву
                if (b[i] < 6) {  // находим числа меньше 6
                    b[i] *= 6;  // умножаем найденные числа на 6
                }
            }
        }
        String s = Arrays.toString(b); // печать в консоль
        System.out.println(s);
    }

    // задача 4
    public static void massQuadDiagonal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину стороны равностороннего массива: ");
        int leng = sc.nextInt(); // вводим длину строки
        int i = leng; // задаём переменную, опред. длинну строки
        int j = i; // приравниваем стороны массива
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

    // задача 5
    private static void initValue() {
        Scanner sc = new Scanner(System.in); // создали сканер
        System.out.print("Введите длину массива: "); // запрос длины строки
        int len = sc.nextInt(); // вводим длину массива
        System.out.print("Введите значение ячейки: "); // запрос знач.яч.
        int initialValue = sc.nextInt(); // вводим значеник в ячейке
        int i = len; // создаём переменную для длины строки
        int[] d = new int[i]; // создаём массив
        for (i = 0; i < len; i++) { // проходим по массиву
            d[i] = initialValue; // присваиваем значения яч-м
        }
        String h = Arrays.toString(d); // печать в консоль
        System.out.println(h);
    }


}
