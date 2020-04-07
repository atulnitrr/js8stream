package com.atul.j8stream.j8stream.j8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindAnyFirstTest {

    @Test
    void test_FindAny() {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7};
        Integer numberAny = Arrays.stream(numbers)
                                .filter(number ->  number < 7 && number > 2  )
                                .findAny()
                                .get();
        System.out.println(numberAny);
    }


    @Test
    void test_whilee() {

        IntStream.iterate(1, num -> num + 1)
                 .limit(100)
                 .forEach(i -> test_FindAny());
    }

    @Test
    void test_FindFrst() {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7};
        Integer numberAny = Arrays.stream(numbers)
                                  .filter(number -> number < 7)
                                  .findFirst()
                                  .get();
        System.out.println(numberAny);
    }
}
