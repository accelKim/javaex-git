package Chapter6Challenge;

public class CircleTest {
  public static void main(String[] args) {
    Circle circle = new Circle(3);
    ColoredCircle coloredCircle = new ColoredCircle(5, "Blue");
    circle.show();
    coloredCircle.show();
  }
}

class Circle{
  int radius = 0;

  Circle() {}

  void show() {
    System.out.println(radius);
  }
  public Circle(int radius){
    this.radius = radius;
  }
}

class ColoredCircle extends Circle{
  String color = "Red";

  void show(){
    System.out.println(radius + "인 공의 색은" + color);
  }

  public ColoredCircle(int radius, String color) {
    this.radius = radius;
    this.color = color;
  }
}