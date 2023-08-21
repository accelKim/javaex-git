package Chapter7;

public class FireTruck extends NormalCar {
  @Override
  public void moveForward() {
    System.out.println("소방차가 앞으로간다");
  }

  @Override
  public void moveBack() {
    System.out.println("소방차가 뒤로간다");
  }
  public void waterPump(){
    System.out.println("물을 뿜는다");
  }
}
