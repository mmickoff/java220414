package ru.gb.mmick.homework2;

public class Exp6Circle {
    public static void main(String[] args) {
        double r1 = 2.1, r2 = 3.12;
        double s1 = calcSR(r1);
        double s2 = calcSR(r2);
        double sumS = s1 + s2;
        print(sumS);
    }

    public static double calcSR(double r) {
        double s = 3.14 * r * r;
      //  System.out.println(s); - начинают печататься плюс ещё площади отдельно
        return s;
    }
    public static void print (double a){
        System.out.println(a);
    }

}
