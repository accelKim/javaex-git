package sample;

public class CircleTset {
  public static void main(String[] args) {
    Circle c1 = new Circle(5.0, "Yellow");
    Circle c2 = new Circle(1.0, "Red");
    Circle c3 = new Circle(3.0, "red");

    System.out.println(Circle.getNunberOfCircle());
    System.out.println(Circle.getNumberOfRedCircle());
  }
}
