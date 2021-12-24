package ru.job4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Multiple {
    public static void main(String[] args) {
        System.out.println("Yaroslav Abaturov");
        System.out.println("30.04.1983");

        System.out.println("1 * 1 = 1");
        System.out.println("2 * 1 = 2");
        System.out.println("3 * 1 = 3");
        System.out.println("4 * 1 = 4");
        System.out.println("5 * 1 = 5");
        System.out.println("6 * 1 = 6");
        System.out.println("7 * 1 = 7");
        System.out.println("8 * 1 = 8");
        System.out.println("9 * 1 = 9");
        System.out.println("10 * 1 = 10");
    }

    private static int computeFor(int value, int factor) {
        return value * factor;
    }

    private static List<Integer> getNums() {
        return new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
