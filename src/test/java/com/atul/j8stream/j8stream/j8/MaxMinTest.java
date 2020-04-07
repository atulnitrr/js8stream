package com.atul.j8stream.j8stream.j8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MaxMinTest {

    @Test
    void test_data() {
        final Integer[] array = {3, 4, 5, -6, 1, 9};
        final List<Integer> integerList = Arrays.asList(array);
        Integer integer = integerList.stream()
                                     .min(Integer::compare)
                                     .get();

        System.out.println(integer);

    }

    @Test
    void test_data_naturalorder() {
        final Integer[] array = {3, 4, 5, -6, 1, 9};
        final List<Integer> integerList = Arrays.asList(array);
        Integer integer = integerList.stream()
                                     .min(Comparator.naturalOrder())
                                     .get();

        System.out.println(integer);

    }

    @Test
    void test_data_naturalorder_3() {
        final Integer[] array = {3, 4, 105, -6, 1, 9};
        final List<Integer> integerList = Arrays.asList(array);
        Integer integer = integerList.stream()
                                     .max(Comparator.naturalOrder())
                                     .get();

        System.out.println(integer);

    }
}
