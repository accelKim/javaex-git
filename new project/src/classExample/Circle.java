package classExample;


  public class Circle {
    private double radius = 0.0;

    public Circle() {
    }

    public Circle(double radius) {
      this.radius = radius;
    }

    public double getRadius() {
      return radius;
    }
    // 워느이 넓이를 구하는 findArea() 메서드 추가하기
    public  double findArea() {
      return Math.PI * radius * radius;
    }
    public void setRadius(double radius) {
      if (radius <= 0.0) {
        System.out.println("원의 반지름은 0보다 커야합니다");
      } else {
        this.radius = radius;
      }
    }
  }

