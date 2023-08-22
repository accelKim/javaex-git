package Chapter7;

public class ControllerTest {
  public static void main(String[] args) {
    Controller[] c = {
        new TV2(true),
        new Radio(false)
    };
    for (Controller controller: c) {
      controller.show();
    }
  }
}

abstract class Controller{
  boolean power;
  abstract String getName();

  public Controller(boolean power) {

    this.power = power;
  }
  void show() {
if (power) {
  System.out.println(this.getName() + "가 켜집니다");
} else {
  System.out.println((this.getName() + "가 꺼집니다"));
}
  }
}

class TV2 extends Controller {

  @Override
  void show() {
    super.show();
  }

  @Override
  String getName() {
    return "TV2";
  }
  public TV2(boolean power){
    super(power);
  }
}
class Radio extends Controller {


  @Override
  public void show() {
    super.show();
  }

  @Override
  String getName() {
    return "Radio";
  }
  public Radio(boolean power){
    super(power);
  }
}
