package ru.job4j.condition;

import static java.lang.Math.pow;

public class SqArea {
    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        double result2 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result2);
    }

    public static double square(double p, double k) {
        double height = p / 2 / (k + 1);
        return pow(height, 2) * k;
    }
}
