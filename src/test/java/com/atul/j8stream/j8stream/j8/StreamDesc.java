package com.atul.j8stream.j8stream.j8;

import com.atul.j8stream.j8stream.pojo.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDesc {

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
    void test() {
        List<String> ccarList = carList.stream().map(Car::getName).collect(Collectors.toList());
        System.out.println(ccarList);
    }


    @Test
    void test_2() {
        List<String> ccarList = carList.stream().map(Car::getName)
                                       .collect(() -> new ArrayList<>(), (list, elem) -> list.add(elem),
                                               (list1, lilst2) -> list1.addAll(lilst2));
        System.out.println(ccarList);
    }


    @Test
    void test_3() {
        List<String> ccarList = carList.stream().map(Car::getName)
                                       .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(ccarList);
    }
}
