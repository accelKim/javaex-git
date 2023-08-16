package Chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class Array2Demo {
  public static void main(String[] args) {
    //표준입력으로 과목 점수를 입력받아서 배열에 저장한다.
    // 학생의 수는 정해져 있지 않고 -1을 입력 받을때 까지 배열에 저장한다.
    //-1이 입력되면 현재 배열에 들어가 있는 점수의 총합과 평균을 구하라
    Scanner s = new Scanner(System.in);
    ArrayList<Integer> scores = new ArrayList<>();
    float avg = 0.0f;
    int num = 0;
    int inputScore = 0;
    for ( ; ; ) {
      System.out.println("점수를 입력하세요");
      inputScore = s.nextInt();
      scores.add(inputScore);
      if (inputScore <= 0) {
        break;
      }
    }
    for ( int score : scores) {
      num += score;
      if(scores.size() == 0) {
        avg = 0;
      } else {
        avg = num / (float) scores.size();
      }
    }

    System.out.printf("num = %d avg = %.1f", num, avg);
  }
}
