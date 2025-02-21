package org.example.stream;

import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        names.stream().forEach(System.out::println);

    }
}
