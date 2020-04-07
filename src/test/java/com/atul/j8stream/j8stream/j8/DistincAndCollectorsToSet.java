package com.atul.j8stream.j8stream.j8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DistincAndCollectorsToSet {


    @Test
    void test_distinct() {
        Integer[] array = {1, 1, 2, 2, 3, 3, 4, 5, 6, 6};
        final List<Integer> integerList = Arrays.asList(array);
        List<Integer> disCollection = integerList.stream()
                                           .distinct()
                                           .collect(Collectors.toList());
        System.out.println(disCollection);
    }

    @Test
    void test_1() {
        Integer[] array = {1, 1, 2, 2, 3, 3, 4, 5, 6, 6};
        final List<Integer> integerList = Arrays.asList(array);
        Set<Integer> disCollection = integerList.stream()
                                          .collect(Collectors.toSet());
        System.out.println(disCollection);
    }
}
