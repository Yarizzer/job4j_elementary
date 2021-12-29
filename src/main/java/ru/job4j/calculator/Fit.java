package ru.job4j.calculator;

public class Fit {
    public static void main(String[] args) {
        short height = 187;

        double man = manWeight(height);
        System.out.println("Man 187 is " + man);

        double woman = womanWeight(height);
        System.out.println("woman 187 is " + woman);
    }

    private static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    private static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

}
