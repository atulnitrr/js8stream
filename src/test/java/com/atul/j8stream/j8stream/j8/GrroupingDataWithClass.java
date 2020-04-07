package com.atul.j8stream.j8stream.j8;

import com.atul.j8stream.j8stream.pojo.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GrroupingDataWithClass {


    private List<Car> carList = new ArrayList<>();


    @BeforeEach
    void setUp() {
        carList.add(new Car("Ferrari", 1690d));
        carList.add(new Car("Ferrari", 1800d));
        carList.add(new Car("Lemo", 1200d));
        carList.add(new Car("toyota", 900d));
        carList.add(new Car("toyota", 100d));
    }

    @Test
    void simpleGrouping() {
        Map<String, List<Car>> carNames = carList.stream()
                                                 .collect(Collectors.groupingBy(Car::getName));
        System.out.println(carNames);
    }

    @Test
    void test_grouping_and_counting() {
        final String[] names = {"ak", "bk", "ak", "bk", "pk"};
        Map<String, Long> allCCount = Arrays.stream(names)
                                          .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(allCCount);
    }
}
