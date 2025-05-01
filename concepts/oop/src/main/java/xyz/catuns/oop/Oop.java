package xyz.catuns.oop;

import xyz.catuns.oop.inheritance.Car;
import xyz.catuns.oop.inheritance.ElectricCar;

public class Oop {

    public static void main(String[] args) {
        Car mercedes = new Car("Mercedes", "S350", 2016);
        ElectricCar air = new ElectricCar("Lucid", "Air", 2024);



//        mercedes.startEngine();

        Car benz = new Car("Mercedes", "S350", 2016);

//        System.out.println("Are the same: " + mercedes.equals(benz));
//        System.out.println("Are not the same?: " + (mercedes == benz)); // DO NOT USE THIS



        air.startEngine();
        System.out.println("Air doors: " + air.getDoors());


        /**
         * Overriding toString
         * Prints the memory location
         */


        System.out.println("Benz: " + benz);

        /**
         * the child class toString should be overwritten
         */

        System.out.println("E-Car: " + air);

         Car lucidCar = new ElectricCar("Lucid", "Air", 2024);

         lucidCar.startEngine();




    }

}
