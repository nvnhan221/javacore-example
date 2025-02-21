package org.example.stream;

import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.parallelStream()
                .mapToInt(n -> n * 2)
                .sum();

        System.out.println(sum);
    }
}
