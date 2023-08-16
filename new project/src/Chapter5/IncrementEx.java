package Chapter5;

public class IncrementEx {
  public static void main(String[] args) {
    for (String arg: args) {
      System.out.println(arg);
    }
    int[] x = {0, 1, 2};
    System.out.println("increment 호출 전 x[0] = " + x[0]);
    increment(x);
    System.out.println("increment 호출 후 x[0] = " + x[0]);

  }
  static void increment(int[] y) {
    System.out.println("increment 메서드, 값 변경 전 y[0] = " + y[0]);
    y[0]++;
    System.out.println("increment 메서드, 값 변경 후 y[0] = " + y[0]);
  }


}
