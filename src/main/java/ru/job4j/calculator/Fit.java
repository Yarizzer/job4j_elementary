package ru.job4j.calculator;

public class Fit {
    public static void main(String[] args) {
        short height = 187;
        double man = getWeightFor(Gender.Male, height);
        System.out.println("Man 187 is " + man);

        double woman = getWeightFor(Gender.Female, height);
        System.out.println("woman 187 is " + woman);
    }

    public static double getWeightFor(Gender gender, short height) {
        return switch (gender) {
            case Female -> (height - 110) * 1.15;
            case Male -> (height - 100) * 1.15;
        };
    }

    private enum Gender {
        Female, Male;
    }

}
