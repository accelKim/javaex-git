package Chapter6Challenge;

public class AccountTest {
  public static void main(String[] args) {
    Account account = new Account();

    account.setBalance(300000);
    System.out.println("현재 잔고 = " + account.getBalance());

    account.whitdarw(300000);
    System.out.println("현재 잔고 = " + account.getBalance());

    account.deposit(1000000);
    System.out.println("현재 잔고 = " + account.getBalance());

    account.deposit(100);
    System.out.println("현재 잔고 = " + account.getBalance());
  }

}
