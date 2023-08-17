package Chapter6Challenge;

public class Vehicle {
  String color = "";

  int speed;

  void show() {
    System.out.println("Vehicle = " +color + speed);
  }

  public Vehicle () {}

  public Vehicle(String color,int speed){
    this.color = color;
    this.speed = speed;
  }
}

