package xyz.catuns.oop.inheritance;

import java.util.Objects;

/**
 * This is documentation about the car
 */
public class Car {
    private final String brand;
    private final String model;
    private final int year;

    protected int doors;

    int number;

    /**
     *
     * @param brand The brand
     * @param model the model
     * @param year release year
     */
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.doors = 4;
    }

    /**
     * Prints to console `engine is starting`
     */
    public void startEngine() {
        System.out.println("The engine is starting...");
    }


    public int getDoors() {
        return doors;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", doors=" + doors +
                ", number=" + number +
                '}';
    }
}
