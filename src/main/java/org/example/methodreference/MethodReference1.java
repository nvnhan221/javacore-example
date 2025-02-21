package org.example.methodreference;

public class MethodReference1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;

        int sum = doAction(a, b, MathUtils::sum); // tham chiếu đến một static method.
        System.out.println(a + " + " + b + " = " + sum); // 10 + 7 = 17

        int minus = doAction(a, b, MathUtils::minus); // tham chiếu đến một static method.
        System.out.println(a + " - " + b + " = " + minus); // 10 - 7 = 3
    }

    public static int doAction(int a, int b, ExecuteFunction func) {
        return func.execute(a, b);
    }
}
