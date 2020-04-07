package com.atul.j8stream.j8stream.j8;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class IntStreamTest {

    @Test
    void test() {
        IntStream.range(0, 10).forEach(System.out::print);
        System.out.println( " ------");
        IntStream.rangeClosed(0, 10).forEach(System.out::print);
    }

    @Test
    void testIntIterate() {
        IntStream.iterate(1, operand -> operand + 1)
                 .filter(num -> num % 2 == 0)
                 .limit(20)
                 .forEach(System.out::println);
    }
}
