package Chapter7;

public class TV implements Controllable, RemoteControllable{

  @Override
  public void turnOn() {
    System.out.println("티비를 킨다");
  }

  @Override
  public void turnOff() {
    System.out.println("티비를 끈다");
  }

  @Override
  public void RemoteOn() {
    System.out.println("리모컨으로 티비를 킨다");
  }

  @Override
  public void RemoteOff() {
    System.out.println("리모컨으로 티비를 끈다");
  }

  @Override
  public void repair() {
    System.out.println("TV를 수리한다");
  }
}
