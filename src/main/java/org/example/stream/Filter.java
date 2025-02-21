package org.example.stream;

import java.util.List;

public class Filter {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");
        List<String> filtered = names.stream()
                .filter(name -> name.startsWith("A"))  // Chỉ giữ lại tên bắt đầu bằng "A"
                .toList();
        System.out.println(filtered); // [Alice]
    }
}