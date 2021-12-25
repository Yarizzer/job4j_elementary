package ru.job4j.calculator;

public class Converter {
    public static void main(String[] args) {
        float euro = convertTo(Currency.Euro, 140);
        System.out.println("140 rubles are " + euro + " euro.");

        float dollar = convertTo(Currency.Dollar, 140);
        System.out.println("140 rubles are " + dollar + " dollars.");
    }

    private static float convertTo(Converter.Currency currency, float value) {
        return switch (currency) {
            case Euro -> value / 70;
            case Dollar -> value / 60;
        };
    }

    private enum Currency {
        Dollar, Euro;
    }
}
