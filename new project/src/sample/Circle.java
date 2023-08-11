package sample;

public class Circle {
  //static /class /정적 변수
  private static long nunberOfCircle;
  private static long numberOfRedCircle;
  //인스턴스 변수
  private double radius;

  private String color;

  public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
    nunberOfCircle++;
    if(color.equalsIgnoreCase("red")) {
      numberOfRedCircle++; //빨강공이 만들어질때만 증가하도록 수정
    }
  }

  public static long getNunberOfCircle() {
    return nunberOfCircle;
  }

  public static long getNumberOfRedCircle() {
    return numberOfRedCircle;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
