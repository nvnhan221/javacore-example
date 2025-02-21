package org.example.methodreference;

public class MethodReference2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;

        MathUtils2 obj = new MathUtils2();
        int sum = doAction(a, b, obj::sum); // tham chiếu tới một instrance method sum
        System.out.println(a + " + " + b + " = " + sum); // 10 + 7 = 17

        int minus = doAction(a, b, obj::minus); // tham chiếu tới một instance method minus
        System.out.println(a + " - " + b + " = " + minus); // 10 - 7 = 3
    }

    public static int doAction(int a, int b, ExecuteFunction func) {
        return func.execute(a, b);
    }
}
