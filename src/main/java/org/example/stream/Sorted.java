package org.example.stream;

import java.util.List;

public class Sorted {
    public static void main(String[] args) {
        List<String> names = List.of("Charlie", "Alice", "Bob");

        // sort by name
        List<String> sortedNames = names.stream()
                .sorted()
                .toList();

        System.out.println(sortedNames); // [Alice, Bob, Charlie]

        // sort by length
        List<String> sortedByLength = names.stream()
                .sorted((a, b) -> Integer.compare(a.length(), b.length()))
                .toList();

        System.out.println(sortedByLength); // [Bob, Alice, Charlie]
    }
}
