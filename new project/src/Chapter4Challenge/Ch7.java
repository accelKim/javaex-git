package Chapter4Challenge;

import java.util.Scanner;

public class Ch7 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int chose = 0;
    long money = 0L;
    long with = 0;
    while(true){
      System.out.println("-------------------------------");
      System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
      System.out.println("-------------------------------");
      System.out.print("선택> ");
      chose = in.nextInt();
      if(chose == 1){
        System.out.print("예금액>");
        with = in.nextLong();
        money += with;
        continue;
      }
      if(chose == 2) {
        System.out.print("출금액>");
        with = in.nextLong();
        money -=with;
        continue;
      }
       if(chose == 3) {
         System.out.println("잔고>"+ money);
         continue;
      }
      if(chose == 4) {
        System.out.println("프로그램 종료");
        break;
      }
    }
   }
  }


