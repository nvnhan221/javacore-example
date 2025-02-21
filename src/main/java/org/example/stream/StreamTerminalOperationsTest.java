package org.example.stream;

import java.util.*;

public class StreamTerminalOperationsTest {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(1, "Van A", 23, "Mumbai", 63.5),
                new Student(2, "Van B", 21, "Pune", 75.0),
                new Student(3, "Van C", 22, "Delhi", 90.0),
                new Student(4, "Van D", 23, "Chennai", 85.5),
                new Student(5, "Van E", 20, "Pune", 79.0),
                new Student(6, "Van F", 20, "Pune", 50.0)
        );

        // 1. Count the total number of students
        long studentCount = students.stream().count();
        System.out.println("Total number of students: " + studentCount);

        // 2. Find the average age of students
        OptionalDouble averageAge = students.stream().mapToInt(Student::getAge).average();
        averageAge.ifPresent(avg -> System.out.println("Average age of students: " + averageAge.getAsDouble()));

        // 3. Check if all students scored above 50
        boolean allPassed = students.stream().allMatch(student -> student.getScore() > 50);
        System.out.println("Did all students pass? " + allPassed);

        // 4. Check if any student from "Pune"
        boolean anyFromPune = students.stream().anyMatch(student -> "Pune".equals(student.getCity()));
        System.out.println("Is there any student from Pune? " + anyFromPune);

        // 5. Find the student with the highest grade
        Optional<Student> topStudent = students.stream().max(Comparator.comparingDouble(Student::getScore));
        topStudent.ifPresent(student -> System.out.println("Top student: " + student.getName()));

        // 6. Print details of all students
        System.out.println("All students: ");
        students.stream().map(Student::getName).forEach(System.out::println);

        // 7. Calculate the total grades of all students combined
        double totalGrades = students.stream().mapToDouble(Student::getScore).sum();
        System.out.println("Total grades of all students: " + totalGrades);
    }
}
