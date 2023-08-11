package classExample2;

public class Triangle {
 private double base;
 private double height;

  public Triangle(double base, double hightet) {
    this.base = base;
    this.height = hightet;
  }
  public void setBase(double base) {
    if(base <= 0.0) {
      System.out.println("밑변는 0보다 커야합니다");
      return;
    }
    this.base = base;
  }
  public void setHeight(double height) {
    if(height <= 0.0) {
      System.out.println("높이는 0보다 커야합니다");
      return;
    }
    this.height = height;
  }
  public double getBase() {
    return base;
  }
  public double getHeight() {
    return height;
  }

  public double findArea() {
    return (base*height)/2;
  }
  public boolean isSameArea(Triangle t2) {
    return  this.findArea() == t2.findArea();
  }





}
