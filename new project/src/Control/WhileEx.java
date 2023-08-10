package Control;

import java.util.Scanner;

public class WhileEx {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String kind = "", bio = "";
    System.out.println("종료를 입력시하시면 종료됩니다");
    while(true) {
      System.out.println("동물의 이름을 입력하세요.");
      bio = in.nextLine();
      if(bio.equals("종료")) {
        break;
      }
      switch (bio) {
        case "호랑이", "사자" -> kind = "포유류";
        case "참새", "독수리" -> kind = "조류";
        default -> kind = "해당없음";
      }
      System.out.printf("%s는 %s입니다.\n", bio, kind);
      }
     }
    }




