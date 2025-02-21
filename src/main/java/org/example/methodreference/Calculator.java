package org.example.methodreference;

import java.util.function.BiFunction;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Lambda expression
        BiFunction<Integer, Integer, Integer> lambdaSum = (a, b) -> Calculator.add(a, b);
        System.out.println(lambdaSum.apply(5, 10));

        // Method reference
        BiFunction<Integer, Integer, Integer> methodRefSum = Calculator::add;
        System.out.println(methodRefSum.apply(10, 20));
    }
}
