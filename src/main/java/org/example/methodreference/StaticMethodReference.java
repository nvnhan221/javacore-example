package org.example.methodreference;

import java.util.function.Function;

public class StaticMethodReference {
    public static void main(String[] args) {
        // Dùng Lambda Expression
        Function<Integer, Double> sqrtLambda = num -> Math.sqrt(num);
        System.out.println(sqrtLambda.apply(25));

        // Dung method reference
        Function<Integer, Double> sqrtMethodRef = Math::sqrt;
        System.out.println(sqrtMethodRef.apply(25));
    }
}
