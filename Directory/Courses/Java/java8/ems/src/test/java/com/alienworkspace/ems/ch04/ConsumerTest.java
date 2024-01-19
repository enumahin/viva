package com.alienworkspace.ems.ch04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {
        // void accept(T t)

        // Example one - Simple consumer
        System.out.println("Example 1 - Display console ");

        Consumer<String> simpleDisplay = (String s) -> System.out.println(s);
                simpleDisplay.accept("lambdas");

        // Example two - store string in database
        System.out.println("\nExample 2 - Storing in db");

        Consumer<String> updateDB = str -> storeInDB(str);
        updateDB.accept("lambdas");

        // Example three - Method accepts Consumer as parameter.
        System.out.println("\nExample 3 - Consumer as parameter");
        performOperationWith("lambdas", simpleDisplay);
        performOperationWith("lambdas", updateDB);

        // Example four - Method accepts Consumer as parameter.
        System.out.println("\nExample 4 - Formatting Strings");

        Consumer<String> displayWithSpaces = (s) -> System.out.println(String.format("%8s", s));
        performOperationWith("lanbdas", displayWithSpaces);

        // Example five - Shows andThen in action
        System.out.println("\nExample 5 - Chaining - andThen()");

        StringBuilder stringBuilder = new StringBuilder("lambdas");

        // "lambdasLAMBDAS
        Consumer<StringBuilder> changeCase = sb -> sb.append(sb.toString().toUpperCase());

        Consumer<StringBuilder> print = (s) -> display(s);

        // Chain behaviour
        Consumer<StringBuilder> chained = changeCase.andThen(print);
        chained.accept(stringBuilder);

        // Using generics
        System.out.println("\nExample using generics-");

        List<String> strings = Arrays.asList("java", "lambdas", "spring");
        performOperationWithGenerics(strings, (s) -> System.out.println(s.toUpperCase()));

        List<Integer> integers = Arrays.asList(1, 2, 3);

        performOperationWithGenerics(integers, (Integer number) -> System.out.println(number));

    }

    private static void storeInDB(String input) {
        if (null != input)
            System.out.println("Storing the input - " + input + " in database...");
    }

    private static void display(StringBuilder string) {
        System.out.println(string);
    }

    // passing behaviour
    private static <T> void performOperationWith(String s, Consumer<String> operation) {
        if (null != s)
            operation.accept(s);
    }

    // passing behaviour
    private static <T> void performOperationWithGenerics(List<T> input, Consumer<T> operation) {
        if (null != input) {
            for (T t : input) {
                operation.accept(t);
            }
        }
    }
}
