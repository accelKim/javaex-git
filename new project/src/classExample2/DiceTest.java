package classExample2;

public class DiceTest {
  public static void main(String[] args) {
    Dice d = new Dice();
    for(int i = 0; i < 6; i++) {
      System.out.printf("주사위의 숫자는 %d입니다.\n", d.roll());
    }

  }
}