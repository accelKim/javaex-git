package Chapter6Challenge;

import java.util.Scanner;
public class MyBankApplicaton {
  static BankAccount[] accounts = new BankAccount[100];
  static Scanner in = new Scanner(System.in);

  static BankAccount account2 = new BankAccount();
  static BankAccount account = new BankAccount();
  static String exAccount;
  static int depos;

  public static void main(String[] args) {
    int opt = 0;

    while (true) {
      System.out.println("---------------------------------------------");
      System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
      System.out.println("---------------------------------------------");
      System.out.print("선택 =>");
      opt = in.nextInt();
      if (opt == 5) {
        System.out.println("프로그램 종료");
        break;
      }
      switch (opt) {
        case 1:
          createAccount();
          break;
        case 2:
          accountList();
          break;
        case 3:
          depositMoney();
          break;
        case 4:
          withdraw();
          break;
      }
    }
  }

  static void createAccount() {
    if (account.getAccountNo() == null) {
      System.out.println("----------");
      System.out.println("계좌생성");
      System.out.println("----------");
      System.out.println();
      System.out.print("계좌번호: ");
      account.setAccountNo(in.nextLine());
      account.setAccountNo(in.nextLine());
      System.out.print("계좌주 : ");
      account.setAccountOwner(in.nextLine());
      System.out.print("초기입금액");
      account.setBalance(in.nextInt());
      System.out.println("계좌를 생성합니다.");
    } else if (account.getAccountNo().length() >= 1){
      System.out.println("----------");
      System.out.println("계좌생성");
      System.out.println("----------");
      System.out.print("계좌번호: ");
      account2.setAccountNo(in.nextLine());
      account2.setAccountNo(in.nextLine());
      System.out.println();
      System.out.print("계좌주 : ");
      account2.setAccountOwner(in.nextLine());
      System.out.print("초기입금액");
      account2.setBalance(in.nextInt());
      System.out.println("계좌를 생성합니다.");
    }
  }
     static void depositMoney (){
      System.out.println("----------");
      System.out.println("예금");
      System.out.println("----------");
       System.out.print("계좌번호: ");
      exAccount = in.nextLine();
       exAccount = in.nextLine();
      System.out.println();
      if (exAccount.equals(account.getAccountNo())) {
        System.out.print("예금액 : ");
        depos = in.nextInt();
        account.setBalance(account.getBalance() + depos);
      } else if (exAccount.equals(account2.getAccountNo())) {
        System.out.print("예금액 : ");
        depos = in.nextInt();
        account2.setBalance(account2.getBalance() + depos);
      } else if (exAccount != account.getAccountNo() || exAccount != account2.getAccountNo()) {
        System.out.println("존재하지 않는 계좌입니다");
      }
    }
    static void accountList(){
      System.out.println("----------");
      System.out.println("계좌목록");
      System.out.println("----------");
      System.out.println(account.getAccountNo() + "   " + account.getAccountOwner() + "   " + account.getBalance());
      if(account2.getAccountNo() != null)
      System.out.println(account2.getAccountNo() + "   " + account2.getAccountOwner() + "   " + account2.getBalance());
    }
    static void withdraw(){
      System.out.println("----------");
      System.out.println("출금");
      System.out.println("----------");
      System.out.print("계좌번호: ");
      exAccount = in.nextLine();
      exAccount = in.nextLine();
      System.out.println();
      if (exAccount.equals(account.getAccountNo())) {
        System.out.print("출금액 : ");
        depos = in.nextInt();
        account.setBalance(account.getBalance() - depos);
      } else if (exAccount.equals(account2.getAccountNo())) {
        System.out.print("출금액 : ");
        depos = in.nextInt();
        account2.setBalance(account2.getBalance() - depos);
      } else if (exAccount != account.getAccountNo() || exAccount != account2.getAccountNo()) {
        System.out.println("존재하지 않는 계좌입니다");
      }
    }
  }



