package xyz.catuns.eva.inheritance;

public class Triangle extends Shape {

  private double base;
  private double height;

  public Triangle(double totalArea) {
    super(totalArea);
  }

  @Override
  public double calculateArea(){
    double area = (0.5 * (base * height));
    return area;
  }
}
