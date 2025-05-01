package xyz.catuns.oop.abstraction;

public abstract class Car implements Vehicle {

    public static final int WHEELS = 4;

    private float fuel = 100f;
    private boolean isRunning = false;

    /**
     * in liters
     */
    protected final double engineVolume;
    protected final Drivetrain drivetrain;


    /**
     *
     * @param engineVolume in liters
     * @param drivetrain
     */
    public Car(Float engineVolume, Drivetrain drivetrain) {
        this.engineVolume = engineVolume;
        this.drivetrain = drivetrain;
    }


    enum Drivetrain {
        ALL_WHEEL_DRIVE,
        FRONT_WHEEL_DRIVE,
        BACK_WHEEL_DRIVE
    }

    /**
     *
     * Determines how much fuel is reduced
     *
     * @return float
     */
    abstract float fuelConsumed();

    @Override
    public void start() {
        if (isRunning) {
            System.out.println("Car is already running");
            return;
        }

        System.out.println("Starting car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping car");
        this.isRunning = false;
    }

    /**
     * Only accelerates if `isRunning` and
     * `fuel` is greater than zero
     */
    @Override
    public void accelerate() {
        if (this.isRunning && fuel > 0) {
            System.out.println("Car is accelerating");
            float fuelRemaining = fuel - fuelConsumed();
            this.fuel = Math.max(fuelRemaining, 0);
        } else {
            System.out.println("Car is not accelerating");
        }
    }

    @Override
    public int getWheels() {
        return WHEELS;
    }

    /**
     * The Amount of fuel left
     * @return float in gallons
     */
    public float getFuel() {
        return fuel;
    }

    public boolean isRunning() {
        return isRunning;
    }
}
