package Chapter7;

public class AMB extends NormalCar {
  @Override
  public void moveForward() {
    System.out.println("구급차가 앞으로간다");
  }

  @Override
  public void moveBack() {
    System.out.println("구급차가 뒤로간다");
  }
  public void silen() {
    System.out.println("사이렌을 울린다");
  }
}
