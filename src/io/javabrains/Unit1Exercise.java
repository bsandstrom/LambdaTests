package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1Exercise {

    public static void main(String[] args){
        List<Person> people = Arrays.asList(
                new Person("Charlse", "Dickens", 60),
                new Person("Lewis", "Carroll", 60),
                new Person("Thomas", "Carlyle", 60),
                new Person("Charlotte", "Bronte", 60),
                new Person("Matthew", "Arnold", 60)
        );

        //Step 1 sort by last name;
        Collections.sort(people, (a, b) -> a.compareTo(b));

        //Step 2 print all elements in list
        System.out.println("Print sorted list");
        people.stream().filter(p -> p.getFirstName().equals("Lewis")).forEach(p -> System.out.println(p));
        System.out.println();


        //step 3 create a method that prints all the people that have last name beginning with C
        System.out.println("Print Last names starting with C");
        performConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println("This person object is : " + p));
        System.out.println();

        System.out.println("Print anyone with firt name starting with C");
        performConditionally(people, p -> p.getFirstName().startsWith("C"), p -> System.out.println(p));
        Predicate p;
    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer){
        for(Person p : people){
            if(predicate.test(p)){
                consumer.accept(p);
            }
        }
    }

}