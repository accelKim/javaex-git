package Chapter5;

import java.util.Scanner;

public class ArrayDemo {
  public static void main(String[] args) {
    //표준입력으로 5개의 과목 점수를 입력받아서 배열에 저장한다.
    //배열에 들어가 있는 점수의 총합과 평균을 구하라.
    Scanner s = new Scanner(System.in);
    int[] scores = new int[5];
    float avg = 0.0f;
    int num = 0;
    for (int i = 0; i <scores.length ; i++) {
      scores[i] = s.nextInt();
    }
    for (int score: scores) num += score;
    avg = num / (float) scores.length;
    System.out.printf("num = %d avg = %.1f", num, avg);
    }
  }

