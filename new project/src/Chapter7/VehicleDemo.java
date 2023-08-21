package Chapter7;

public class VehicleDemo {
  public static void main(String[] args) {
    // Vehicle 은 앞으로 간다 뒤로간다 메서드기능
    // firetruck 은 물을 뿜는다
    // amb 는 사이렌을 울린다
    // V v1 = new Firetruck
    // V v2 = new Amb
    Vehicle vehicle1 = new FireTruck();
    Vehicle vehicle2 = new AMB();
    Vehicle vehicle3 = new NormalCar();
    action(vehicle3);
    action(vehicle2);
    action(vehicle1);
  }

  static void action(Vehicle vehicle) {
    if (vehicle instanceof FireTruck) {
      ((FireTruck) vehicle).waterPump();
    } else if (vehicle instanceof AMB) {
      ((AMB) vehicle).silen();
    } else if (vehicle instanceof NormalCar) {
      vehicle.moveForward();
    }
  }
}

