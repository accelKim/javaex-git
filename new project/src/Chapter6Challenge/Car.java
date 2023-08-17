package Chapter6Challenge;

public class Car extends Vehicle {
  int displacement; //배기량
  int gears; // 기어 단수

  public Car(){}

  @Override
  void show() {
    System.out.printf("색 = %s 속도 = %d 배기량 = %d 단수 = %d\n", color, speed, displacement, gears);
  }

  public Car(String color, int speed, int displacement, int gears) {
    this.color = color;
    this.speed = speed;
    this.displacement = displacement;
    this.gears = gears;
  }

  }

