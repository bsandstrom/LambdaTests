package io.javabrains;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charlse", "Dickens", 60),
                new Person("Lewis", "Carroll", 60),
                new Person("Thomas", "Carlyle", 60),
                new Person("Charlotte", "Bronte", 60),
                new Person("Matthew", "Arnold", 60)
        );

        System.out.println("Print anyone");
        performConditionally(people, p -> true, System.out::println);

    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }

}