package org.example.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "Alice");

        List<String> nameList = names.stream().collect(Collectors.toList());
        System.out.println(nameList); // [Alice, Bob, Charlie, Alice]

        Set<String> nameSet = names.stream().collect(Collectors.toSet());
        System.out.println(nameSet); // [Alice, Bob, Charlie] (loại bỏ trùng)
    }
}
