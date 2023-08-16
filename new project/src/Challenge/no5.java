package Challenge;

public class no5 {
  public static void main(String[] args) {
    System.out.println(sum(1, 2, 3, 4));
    int[] arr = {2, 3};
    System.out.println(sum(1, arr));
    System.out.println(sum(1, 2, 3, 4, 5));
  }

  static int sum(int i,int... numbers) {
    int sum = 0;
    for (int num: numbers) {
      sum += num;
    }
    return sum;
  }
}
