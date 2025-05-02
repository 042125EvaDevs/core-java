package xyz.catuns.eva.inheritance;

public class Rectangle extends Shape{

  private double length;

  private double height;

  public Rectangle(double area) {
    super(area);
  }

  @Override
  public double calculateArea(){
    double area = length * height;
    return area;
  }
}
