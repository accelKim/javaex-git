package Control;

import java.util.Scanner;

public class MultyIf {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("점수를 입력해주세요. (0~100)");
    int score = in.nextInt();
    String grade = "";
    if (score >= 90) {
      if(score >= 95) {
        grade = "A+";
      } else {
        grade = "A-";
      }
    } else if (score >= 80) {
      if( score >= 85) {
        grade = "B+";
      } else {
        grade = "B0";
      }
    } else if (score >= 70) {
      grade = "C";
    } else if (score >= 60) {
      grade = "D";
    } else {
      grade = "F";
    }
    System.out.println("Your grade is : " + grade);
  }
}
