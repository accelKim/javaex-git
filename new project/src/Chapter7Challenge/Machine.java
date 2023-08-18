package Chapter7Challenge;

public abstract class Machine{
  public void powerOn() {}
  public void powerOff(){}
  public abstract void work();
}

class Computer extends Machine{
  @Override
  public void work() {
    System.out.println("작동한다");
  }
}