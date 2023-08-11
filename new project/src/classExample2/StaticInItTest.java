package classExample2;

public class StaticInItTest {
  public static void main(String[] args) {
    System.out.println(StaticInIt.sumOneToTen);
    System.out.println(StaticInIt.sumOneToTen2);
  }
}

class StaticInIt {
  static int sumOneToTen;
  static {
    int sum = 0;
    for(int i = 1; i<=10; i++) {
      sum += i;
    }
    sumOneToTen = sum;
  }
  static int sumOneToTen2;
  static {
    int sum = 0;
    for(int i = 1; i<=10; i++) {
      sum += i;
    }
    sumOneToTen2 = sum;
  }
}
