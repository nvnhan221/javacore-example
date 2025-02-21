package org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ShortCircuitingOperationTest {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Java Basics", "Alice", 200, true),
                new Book("Advanced Java", "Bob", 550, false),
                new Book("Spring Framework", "Alice", 320, true),
                new Book("Hibernate Essentials", "Charlie", 450, true),
                new Book("Microservices Design", "Bob", 150, false),
                new Book("Clean Code", "Martin", 600, true)
        );

        // 1. Find the first available book by "Alice";
        Optional<Book> firstAvailable = books.stream()
                .filter(book -> "Alice".equals(book.getAuthor()) && book.isAvailable())
                .findFirst();
        firstAvailable.ifPresent(book -> System.out.println("First available book by Alice: " + book.getTitle()));

        // check if there's any book with more than 500 pages;
        boolean anyBookWithMoreThan500Pages = books.stream().anyMatch(book -> book.getPages() > 500);
        System.out.println("Is there any book with more than 500 pages? " + anyBookWithMoreThan500Pages);

        // Verify if all books have more than 100 pages
        boolean allBookMoreThan100Pages =  books.stream().allMatch(book -> book.getPages() > 100);
        System.out.println("Do all books have more than 100 pages? " + allBookMoreThan100Pages);

        // 4. Limit the list of books to the top 3 available ones
        List<Book> top3Available = books.stream()
                .filter(Book::isAvailable)
                .limit(3).toList();
        System.out.println("Top 3 available books: ");
        top3Available.forEach(System.out::println);
    }
}
