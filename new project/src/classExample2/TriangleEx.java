package classExample2;

public class TriangleEx {
  public static void main(String[] args) {
    Triangle t = new Triangle(10.0, 5.0);
    System.out.println("t.넓이 = " + t.findArea());
    Triangle t2 = new Triangle(5.0, 10.0);
    Triangle t3 = new Triangle(8.0, 8.0);

    System.out.println(t.isSameArea(t2));
    System.out.println(t.isSameArea(t3));
  }
}
