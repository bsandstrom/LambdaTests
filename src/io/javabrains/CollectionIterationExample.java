package io.javabrains;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

    public static void main(String[] args){
        List<Person> people = Arrays.asList(
                new Person("Charlse", "Dickens", 60),
                new Person("Lewis", "Carroll", 60),
                new Person("Thomas", "Carlyle", 60),
                new Person("Charlotte", "Bronte", 60),
                new Person("Matthew", "Arnold", 60)
        );

        for(Person p : people){
            System.out.println(p);
        }

        System.out.println();
        people.forEach(System.out::println);

    }

}
