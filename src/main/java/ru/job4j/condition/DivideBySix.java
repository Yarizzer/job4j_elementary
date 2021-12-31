package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (isDividedBy3(number) && isEven(number)) {
            rsl = "Исходное число делится на 6.";
        } else if (isDividedBy3(number)) {
            rsl = "Исходное число делится на 3, но не является четным.";
        } else if (isEven(number)) {
            rsl = "Исходное число не делится на 3, но является четным.";
        } else {
            rsl = "Исходное число не делится на 3 и не является четным.";
        }
        return rsl;
    }

    private static boolean isDividedBy3(int value) {
        return value % 3 == 0;
    }

    private static boolean isEven(int value) {
        return value % 2 == 0;
    }
}
