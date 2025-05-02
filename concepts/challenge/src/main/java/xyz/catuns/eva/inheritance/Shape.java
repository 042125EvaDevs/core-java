package xyz.catuns.eva.inheritance;



abstract class Shape {

  private double area;

  public Shape(double area) {
    this.area = area;
  }

  protected double calculateArea(){
   return area;
 }
}
