package xyz.catuns.oop.abstraction;

import java.util.ArrayList;
import java.util.List;

public class Abstraction {

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Van(2.5f));
        vehicles.add(new Van(7f));
        vehicles.add(new MotorCycle());
        vehicles.add(new MotorCycle());

        Vehicle first = vehicles.getFirst();
        Vehicle last = vehicles.getLast();

        first.start();
        first.accelerate();
        first.describeVehicle();
        first.stop();


        first.describeVehicle(); // 4
        last.describeVehicle(); // 2

    }
}
