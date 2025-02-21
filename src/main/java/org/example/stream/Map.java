package org.example.stream;

import java.util.List;

public class Map {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        List<Integer> nameLengths = names.stream()
                .map(String::length) // Chuyển đổi tên thành độ dài của chúng
                .toList();

        System.out.println(nameLengths); // [5, 3, 7]
    }
}
