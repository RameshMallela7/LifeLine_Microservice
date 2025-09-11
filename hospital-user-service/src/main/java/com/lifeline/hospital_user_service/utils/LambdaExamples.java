package com.lifeline.hospital_user_service.utils;

import java.util.function.*;
import java.util.*;

/**
 * Demonstrates all major Java lambda functional interfaces with sample code and explanations.
 */
public class LambdaExamples {
    public static void main1(String[] args) {
        // Predicate<T>: Tests a condition and returns boolean
        Predicate<String> isNotEmpty = s -> s != null && !s.isEmpty();
        System.out.println("Predicate: 'Hello' is not empty? " + isNotEmpty.test("Hello"));

        // Function<T, R>: Transforms input to output
        Function<Integer, String> intToString = i -> "Number: " + i;
        System.out.println("Function: " + intToString.apply(5));

        // Consumer<T>: Consumes input, returns nothing
        Consumer<String> printUpper = s -> System.out.println(s.toUpperCase());
        System.out.print("Consumer: "); printUpper.accept("hello");

        // Supplier<T>: Supplies a value, no input
        Supplier<Date> currentDate = () -> new Date();
        System.out.println("Supplier: Current date is " + currentDate.get());

        // UnaryOperator<T>: Operates on one value, returns same type
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println("UnaryOperator: Square of 4 is " + square.apply(4));

        // BinaryOperator<T>: Operates on two values, returns same type
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("BinaryOperator: 3 + 7 = " + add.apply(3, 7));
    }

    public static void main2(String[] args) {
        System.out.println(sum(2,5,3,7,2,6,86));
    }

    /**
     * Sums any number of Integer arguments (null-safe) with overflow detection.
     * Uses parallel stream for potential performance on larger inputs.
     *
     * Integer.MAX_VALUE =  2_147_483_647 (largest 32-bit signed int)
     * Integer.MIN_VALUE = -2_147_483_648 (smallest 32-bit signed int)
     *
     * @param in variable number of Integer values (may contain nulls)
     * @return the sum (0 if input is null/empty or only nulls)
     * @throws ArithmeticException if the computed sum overflows Integer range
     */
    public static Integer sum(Integer... in) {
        if (in == null || in.length == 0) {
            return 0;
        }

        int sum = Arrays.stream(in)
                .parallel()
                //.filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .sum();

        // Overflow check against 32-bit signed integer bounds
        if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
            throw new ArithmeticException("Integer overflow: " + sum);
        }
        return sum;
    }
}
