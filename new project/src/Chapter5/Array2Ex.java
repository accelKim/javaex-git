package Chapter5;

import java.util.Arrays;

public class Array2Ex {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    for (int num: arr) {
      System.out.println(num);
    }
    System.out.println(arr); // [1,2,3,4,5]로 안나옴
    System.out.println(Arrays.toString(arr));

    char[] cArr = {'a','b','c'}; // 문자를 배열로 만든것이 문자열이기 때문에 arrays 의 도움없이 abc를 찍을수있음
    for (char c:cArr) {
      System.out.println(c);
    }
    System.out.println(cArr);
  }
}
