package xyz.catuns.oop.polymorphism;

public class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, Character b) {

        return a + (int) b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result = calculator.add(1, 2);
    }
}
