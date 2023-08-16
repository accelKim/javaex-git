package Challenge;

import java.util.Scanner;

public class no3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);


    while (true) {
      System.out.println("URL을 입력하세요 : (종료하려면 Bye를 입력하세요)\n");
      String URL = in.nextLine();
      if (URL.equalsIgnoreCase("bye")) break;
      if (URL.toLowerCase().endsWith("com")) {
        System.out.printf("%s은 'com'으로 끝납니다.\n", URL);
      } else {
        System.out.printf("%s은 'com'을 포함하지 않습니다.\n", URL);
      }
      if (URL.toLowerCase().contains("java")) {
        System.out.printf("%s은 'java를 포함합니다.\n", URL);
      } else {
        System.out.printf("%s은 'java를 포함하지 않습니다.\n", URL);
      }


    }
  }
}
