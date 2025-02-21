package org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Create {
    public static void main(String[] args) {
        // create a stream from list
        List<String> nameList = List.of("Alice", "Bob", "Charlie");
        Stream<String> streamFromList = nameList.stream(); // Tạo Stream từ List
        streamFromList.forEach(System.out::println);

        // create a stream from array
        String[] nameArray = {"Alice", "Bob", "Charlie"};
        Stream<String> stream = Arrays.stream(nameArray);
        stream.forEach(System.out::println);

        // create a stream use Stream.of
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        numbers.forEach(System.out::println);

    }
}
