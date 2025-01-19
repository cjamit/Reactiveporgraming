package org.amitchavan.reactive;

import java.util.stream.Stream;

/**
 * This class is a source of collection streams used in the exercises.
 * DO NOT MODIFY THIS CODE
 *
 * @author koushikkothagal
 */
public class StreamSources {

    public static Stream<String> stringNumbersStream() {
        return Stream.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
    }

    public static Stream<Integer> intNumbersStream() {
        return Stream.iterate(0, i -> i + 2)
                .limit(10);
    }

    public static Stream<Employee> userStream() {
        return Stream.of(
                new Employee(1, "Sam", "Kelo"),
                new Employee(2, "Tom", "Messos"),
                new Employee(2, "Jack", "Matter"),
                new Employee(4, "Sam", "Aldo"),
                new Employee(5, "Matt", "Musk"),
                new Employee(6, "Ken", "Griffin")s
        );
    }
}
