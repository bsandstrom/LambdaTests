package io.javabrains;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        int[] someNumbers = {1, 2, 3, 4,};
        int key = 1;

        process(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
    }


    public static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : someNumbers) {
            consumer.accept(i, key);
        }
    }

    private static <T, U> BiConsumer<T, U> wrapperLambda(BiConsumer<T, U> consumer) {
        return (T a, U b) -> {
            try {
                consumer.accept(a, b);
            } catch (ArithmeticException e){
                System.out.println("ArithmeticException occurred.");
            }
        };
    }
}
