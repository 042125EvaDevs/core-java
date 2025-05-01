package xyz.catuns.oop.abstraction;

public class Van extends Car {

    public Van(Float engineVolume) {
        super(engineVolume, Drivetrain.ALL_WHEEL_DRIVE);
    }

    /**
     *
     * Determines how much fuel is reduced
     *
     * @return
     */
    @Override
    float fuelConsumed() {
        return engineVolume > 5 ? 20 : 10;
    }
}
