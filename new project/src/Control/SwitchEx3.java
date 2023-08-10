package Control;

import java.util.Scanner;

public class SwitchEx3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("동물의 이름을 입력하세요.");
    String bio = in.nextLine();
    String kind = ""; //버그를 피하기 위해 값을 빈문자열로 넣어주는것이 좋음
    if (bio.equals("호랑이") || bio.equals("사자")) { //String은 bio.equals() 로 비교해야함
      kind = "포유류";
    } else if (bio.equals("독수리") || bio.equals("참새")) {
      kind = "조류";
    } else {
      kind = "해당없음";
    }
    System.out.printf("%s는 %s입니다\n", bio, kind);

//    System.out.println("동물의 이름을 입력하세요.");
//    bio = in.nextLine(); // 위에서 String 선언했기 때문에  String 다시 안써두 됨
//    kind = ""; //위에서 나와던 값을 다시 호출하기전 초기화 해주어야함
//    switch (bio) {
//      case "호랑이":
//      case "사자":
//        kind = "포유류";
//        break;
//      case "독수리":
//      case "참새":
//        kind = "조류";
//        break;
//      default:
//        kind = "해당없음";
//    }
//    System.out.printf("%s는 %s입니다 %s 글자입니다.", bio, kind, kind.length());
//  }
    System.out.println("동물의 이름을 입력하세요."); // 개선된 switch 문 break 필요없음 :대신 -> 사용
    bio = in.nextLine();
    kind = "";
    switch (bio) {
      case "호랑이", "사자" -> kind = "포유류";
      case "참새", "독수리" -> kind = "조류";
      default -> kind = "해당없음";
    }
    System.out.printf("%s는 %s입니다.", bio, kind);
  }
}
