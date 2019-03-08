package io.javabrains;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample1 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charlse", "Dickens", 60),
                new Person("Lewis", "Carroll", 60),
                new Person("Thomas", "Carlyle", 60),
                new Person("Charlotte", "Bronte", 60),
                new Person("Matthew", "Arnold", 60)
        );

        people.stream()
                .filter(p -> p.getFirstName().startsWith("C"))
                .forEach(p -> System.out.println(p.getFirstName()));

        System.out.println();

        long count = people.parallelStream()
                .filter(p -> p.getLastName().startsWith("D"))
                .count();

        System.out.println(count);

    }


}
