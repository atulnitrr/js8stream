package com.atul.j8stream.j8stream.j8;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReduceTest {

    private static final List<ArrayList<String>> arrayListOfNames = Lists.newArrayList(
            Lists.newArrayList("Mariam", "Alex", "Ismail"),
            Lists.newArrayList("John", "Alesha", "Andre"),
            Lists.newArrayList("Susy", "Ali")
    );

    @Test
    void test_reduce_array() {
        List<String> list = new ArrayList<>();
        ArrayList<String> reduceLists = arrayListOfNames.stream()
                                                        .reduce(new ArrayList<>(), (list2, elems) -> {
            list2.addAll(elems);
            return list2;
        });

        System.out.println(reduceLists);

    }


    @Test
    void flatMap_Test() {
        List<String> listSTring = arrayListOfNames.stream()
                                                  .flatMap(List::stream).collect(Collectors.toList());

        System.out.println(listSTring);
    }

    @Test
    void test_reduce() {
        final Integer[] arrayInteger = {1, 2, 3, 4, 5, 6};
        Integer reduceTotal = Arrays.stream(arrayInteger).reduce(10, (a, b) -> a + b);
        System.out.println(reduceTotal);
    }


    @Test
    void test_joining() {
        String[] strings = {"ab", "cd", "mn"};
        String joined = Arrays.stream(strings).collect(Collectors.joining("->"));
        System.out.println(joined);
    }

    @Test
    void test_joining_without_Stram() {
        String[] strings = {"ab", "cd", "mn"};
        String joined = String.join("->", strings);
        System.out.println(joined);
    }
}
