package org.example.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Anonymous class (truoc java8)
        MyInterface obj = new MyInterface() {
            @Override
            public void sayHello() {
                System.out.println("Hello, Java!");
            }
        };
        obj.sayHello();

        // Sau java 8, lambda expression
        MyInterface obj2 = () -> System.out.println("Hello, Java 2!");
        obj2.sayHello();

        MathOperation sum = (a, b) -> a + b;
        MathOperation mul = (a, b) -> a * b;
        System.out.println(sum.operate(5, 3));
        System.out.println(mul.operate(5, 3));

        // collection truoc java8
        List<String> names = Arrays.asList("John", "Anna", "Mike");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(names);

        // java8
        names.sort(String::compareTo);
        System.out.println(names);
    }
}
