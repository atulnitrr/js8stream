package com.atul.j8stream.j8stream.j8;

import com.atul.j8stream.j8stream.pojo.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FilterAndTransformation {


    private List<Car> carList = new ArrayList<>();


    @BeforeEach
    void setUp() {
        carList.add(new Car("Ferrari", 1690d));
        carList.add(new Car("Lemo", 1200d));
        carList.add(new Car("toyota", 900d));
    }

    @Test
    void test_1() {
        List<Car> carList = this.carList.stream().filter(car -> car.getPrice() < 1800)
                                        .collect(Collectors.toList());

        System.out.println(carList);

    }

    @Test
    void testMapping() {

        Function<Car, String> getName = Car::getName;
        List<String> carNames = carList.stream()
                                       .map(Car::getName)
                                       .collect(Collectors.toList());
        System.out.println(carNames);
    }

    @Test
    void testMapping_price() {

        double value = carList.stream()
                          .mapToDouble(Car::getPrice)
                          .average()
                          .orElse(0);
        System.out.println(value);
    }



}
