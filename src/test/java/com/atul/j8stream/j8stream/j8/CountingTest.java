package com.atul.j8stream.j8stream.j8;

import com.atul.j8stream.j8stream.pojo.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class CountingTest {


    private List<Car> carList = new ArrayList<>();


    @BeforeEach
    void setUp() {
        carList.add(new Car("Ferrari", 1690d));
        carList.add(new Car("Lemo", 1200d));
        carList.add(new Car("toyota", 900d));
        carList.add(new Car("toyota", 100d));
    }

    @Test
    void test_count() {
        long toyotaCount = carList.stream()
                             .filter(car -> car.getName().equalsIgnoreCase("toyota"))
                             .count();

        System.out.println(toyotaCount);
    }

    @Test
    void test_min() {
        double toyotaPrice = carList.stream()
                               .filter(car -> car.getName().equalsIgnoreCase("toyota"))
                               .mapToDouble(Car::getPrice)
                               .min()
                               .getAsDouble();

        System.out.println(toyotaPrice);

    }

    @Test
    void test_max() {
        double toyotaPrice = carList.stream()
                                    .filter(car -> car.getName().equalsIgnoreCase("toyota"))
                                    .mapToDouble(Car::getPrice)
                                    .max()
                                    .getAsDouble();

        System.out.println(toyotaPrice);

    }

    @Test
    void test_aveerage() {
        double toyotaPrice = carList.stream()
                                    .filter(car -> car.getName().equalsIgnoreCase("toyota"))
                                    .mapToDouble(Car::getPrice)
                                    .average()
                                    .getAsDouble();

        System.out.println(toyotaPrice);

    }

    @Test
    void test_sum() {
        double toyotaPrice = carList.stream()
                                    .filter(car -> car.getName().equalsIgnoreCase("toyota"))
                                    .mapToDouble(Car::getPrice)
                                    .sum();

        System.out.println(toyotaPrice);
    }

    @Test
    void test_statics() {
        DoubleSummaryStatistics toyotaSummary = carList.stream()
                                                .filter(car -> car.getName().equalsIgnoreCase("toyota"))
                                                .mapToDouble(Car::getPrice)
                                                .summaryStatistics();

        System.out.println(toyotaSummary);
    }


}
