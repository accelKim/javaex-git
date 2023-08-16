package Chapter6;

public class Circle {
  double radius;
  static String color = "White";
  static void setRadius(String aaa) {
    color = aaa;
  }

  final void changeRadius(double radius) {
    this.radius = radius;
  }
  private void secret(){
    System.out.println("비밀입니다");
  }
  protected void findRadius(){
    System.out.println("반지름이 10.0입니다");
  }
  public double findArea() {
    return Math.PI * radius * radius;
  }
}
