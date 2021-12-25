package ru.job4j.calculator;

public class MathFunc {
    public static void main(String[] args) {
        int result1 = func1(3);
        int result2 = func2(5);

        System.out.println(result1 + result2);

        int result3 = func1(100);

        System.out.println(result3);
    }

    private static int func1(int x) {
        return x * x + 1;
    }

    private static int func2(int x) {
        return x * 10;
    }
}
