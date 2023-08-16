package Challenge;

import java.util.Scanner;

public class no4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num =0;
    int mok =0;
    int[] numbers = new int[10];
    for (int i = 0; i < 10; i++) {
      System.out.printf("%d 번째 숫자에(0~99사이의 정수)를 입력하세요",i+1);
      num = in.nextInt();
      if(num >= 0 && num <100) {
        mok = num / 10;
        numbers[mok]++;
       }
      }
    for (int i = 0; i < numbers.length; i++) {
      System.out.printf("%d 에서 %d : ", i*10, i*10+9);
      for (int j = 0; j < numbers[i]; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    }
  }

