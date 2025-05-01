package xyz.catuns.oop.inheritance;

public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String brand, String model, int year) {
        super(brand, model, year);
        this.batteryCapacity = 100;
        this.doors = 3;
    }

    public void charge() {
        System.out.println("Charging the battery...");

        setBatteryCapacity(batteryCapacity + 10);
    }

    @Override
    public void startEngine() {
        System.out.println("Battery activated");
        super.startEngine();
    }

    public void setBatteryCapacity(int updatedCapacity) {

        /**
         * Ternary operator
         */
        batteryCapacity = updatedCapacity > 100 ? 100 : updatedCapacity;
    }

    @Override
    public String toString() {
        return "ElectricCar {" +
                "batteryCapacity=" + batteryCapacity +
                ", doors=" + doors +
                ", number=" + number +
                '}';
    }
}
