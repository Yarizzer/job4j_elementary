package ru.job4j.calculator;

public class Converter {
    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        float dollar = rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollars.");
    }

    private static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    private static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }
}
