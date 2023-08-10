package Method;

public class Method1Ex {
  public static void main(String[] args) {
//    System.out.printf("sum(%d~%d) = %d\n", num1, num2, sum);
    System.out.printf("sum(1~10) = %d\n", sum(1, 10));
    System.out.printf("sum(10~100) = %d\n", sum(10, 100));
    System.out.printf("sum(100~1000) = %d\n", sum(100, 1000 ));
  }

  static long sum(long num1, long num2) {
    long sum = 0;
    for(long i = num1; i <= num2; i++) {
      sum += i;
    }
    return sum;
  }
}
