package org.example.stream;

import java.util.List;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5);

        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .toList();

        System.out.println(uniqueNumbers); // [1, 2, 3, 4, 5]
    }
}
