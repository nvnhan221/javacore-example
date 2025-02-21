package org.example.stream;

import java.util.List;

public class LimitSkip {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> limited = numbers.stream().limit(3).toList();
        System.out.println(limited); // [1, 2, 3]

        List<Integer> skipped = numbers.stream().skip(2).toList();
        System.out.println(skipped); // [3, 4, 5]
    }
}
