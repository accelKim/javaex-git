package Chapter6Challenge;

public class OverrideTest {
  public static void main(String[] args) {
    Car c = new Car("Red", 100, 1000, 5);
    c.show();

    Vehicle v = c;
    v.show();


  }
}
