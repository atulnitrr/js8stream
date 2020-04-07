package com.atul.j8stream.j8stream.pojo;

public class Car {

    private String name;
    private Double price;

    public Car(String name, Double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static String  mapToName(final Car car) {
        return car.getName();
    }

    public static Double  mapToPrice(final Car car) {
        return car.getPrice();
    }
}
