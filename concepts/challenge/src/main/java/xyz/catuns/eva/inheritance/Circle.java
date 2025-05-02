package xyz.catuns.eva.inheritance;

public class Circle extends Shape {

  private double radius;

  private final double PI = 3.14;

  public Circle(double area) {
    super(area);
  }

  @Override
  public double calculateArea(){
    double area = 2 * PI * (radius * radius);
    return area;

  }
}
