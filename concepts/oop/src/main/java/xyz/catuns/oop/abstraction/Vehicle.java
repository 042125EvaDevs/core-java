package xyz.catuns.oop.abstraction;

public interface Vehicle {

    void start();
    void stop();
    void accelerate();

    int getWheels();

    default void describeVehicle() {
        System.out.println("This is a vehicle with " + getWheels() + " wheels");
    }
}
