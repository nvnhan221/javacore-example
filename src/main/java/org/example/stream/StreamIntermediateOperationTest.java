package org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateOperationTest {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "A", "HR", 200),
                new Employee(2, "B", "FA", 100),
                new Employee(3, "C", "IT", 800),
                new Employee(4, "D", "FA", 500),
                new Employee(5, "E", "IT", 550),
                new Employee(5, "F", "IT", 120)
        );
        System.out.println("Intermediate Operations Demo:");

        List<String> runnersUp = employees.stream()
                // 1. fitler employees with a salary > 200
                .filter(e -> e.getSalary() > 150)
                // 2. map their names to lowercase
                .map(Employee::getName)
                .map(String::toLowerCase)
                // 3. sort the names
                .sorted()
                // 4. distinct names
                .distinct()
                // 5. limit the result to first 3 names
                .limit(3)
                // 6. skip the first result to show runners-up
                .skip(1)
                // 7. peek to debug the current state
                .peek(System.out::println)
                // collect the results into a list.
                .collect(Collectors.toList());
        ;
        System.out.println("Results: " + runnersUp);
    }
}
