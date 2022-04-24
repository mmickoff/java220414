package ru.gb.mmick.homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        massive01();
        massive100();
        massX6();
        initValue();


    }


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
        String s = Arrays.toString(a);
        System.out.println(s);
    }


    public static void massive100() {
        int[] b = new int[100];  // создаём пустой массив на 100яч.
        for (int i = 0; i < b.length; i++) {  // проходим по массиву
            b[i] = i + 1;  // присваиваем ячейкам значения
        }
        String s = Arrays.toString(b);
        System.out.println(s);
    }


    public static void massX6() {
        int[] b = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};  // определяем массив
        {
            for (int i = 0; i < b.length; i++) {  // проходим циклом по массиву
                if (b[i] < 6) {  // находим числа меньше 6
                    b[i] *= 6;  // умножаем найденные числа на 6
                }
            }
        }
        String s = Arrays.toString(b);
        System.out.println(s);
    }


    private static void initValue() {
        Scanner sc = new Scanner(System.in); // создали сканер
        System.out.print("Введите длину массива: ");
        int len = sc.nextInt();
        System.out.print("Введите значение ячейки: ");
        int initialValue = sc.nextInt();
        int i = len;
        int[] d = new int[i];
        for (i = 0; i < len; i++) {
            d[i] = initialValue;
        }
        String h = Arrays.toString(d);
        System.out.println(h);

    }

}
