package Chapter7;

public class NormalCar implements Vehicle{
  @Override
  public void moveForward() {
    System.out.println("앞으로 간다");
  }

  @Override
  public void moveBack() {
    System.out.println("뒤로간다");
  }
}
